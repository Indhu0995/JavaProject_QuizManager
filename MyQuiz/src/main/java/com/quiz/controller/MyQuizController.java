package com.quiz.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.quiz.entity.ExamReleatedQuestions;
import com.quiz.entity.MyExam;
import com.quiz.entity.UserExamHistroy;
import com.quiz.service.MyQuizService;
import com.quiz.service.UtillService;

@RestController
public class MyQuizController {

	@Autowired
	private MyQuizService myQuizService;

	private Integer globalExamId;

	@Autowired
	private UtillService utillService;

	@GetMapping("/")
	public ModelAndView homepage() {

		ModelAndView andView = new ModelAndView("home");
		andView.addObject("examList", myQuizService.getExamList());
		return andView;
	}

	@GetMapping("/addQuestions")
	public String addQuestions() {
		utillService.save();
		return "Succesfully Added Questions";
	}

	@GetMapping("/startExam/{examId}")
	public ModelAndView startExam(@PathVariable Integer examId) {
		ModelAndView andView = new ModelAndView("startExam");
		globalExamId = examId;
		andView.addObject("examQuestions", myQuizService.getQuestionsByExamId(examId));
		andView.addObject("examId", examId);
		return andView;
	}

	@PostMapping("/getQuestionsById")
	public ExamReleatedQuestions getQuestionsById(@RequestBody UserExamHistroy userExamHistroy) {

		ExamReleatedQuestions questions = new ExamReleatedQuestions();
		userExamHistroy.setExamId(globalExamId);
		myQuizService.saveExamHistory(userExamHistroy);
		MyExam myExam = myQuizService.getQuestionsByExamId(globalExamId);
		List<ExamReleatedQuestions> getQuestions = myExam.getExamQuestions();

		if (userExamHistroy.getQuestionId() == 0) {
			questions = getQuestions.get(0);
		} else {
			Integer questionId = userExamHistroy.getQuestionId() + 1;
			for (ExamReleatedQuestions examReleatedQuestions : getQuestions) {
				if (examReleatedQuestions.getQuestionId() .equals(questionId) ) {
					questions = examReleatedQuestions;
				}

			}
		}
		return questions;

	}

	@GetMapping("/submitExam")
	public ModelAndView submitExam() {
		String result = myQuizService.submitExam(globalExamId);

		ModelAndView andView = new ModelAndView("result");

		andView.addObject("result", result);

		myQuizService.deleteSubmitExam(globalExamId);
		return andView;

	}

	@PostMapping("/getExamByserachward")
	public List<MyExam> getExamByserachward(@RequestBody String searchward) {

		List<MyExam> list = myQuizService.getExamList();

		List<MyExam> newlist = new ArrayList<MyExam>();
		searchward = searchward.toUpperCase().trim();
		char c = searchward.charAt(1);
		for (MyExam myExam : list) {

			int i = myExam.getExamDescrption().indexOf(c);
			if (i >= 0) {
				newlist.add(myExam);
			}

		}
		return newlist;
	}

	@PostMapping("/exportFile")
	public String exportFile(@RequestBody Integer id) {
		String path = "";
		List<MyExam> myexam = myQuizService.getExamList();

		for (MyExam myExam2 : myexam) {

			if (myExam2.getExamId().equals(id)) {
				path = prepareFile(myExam2);
			}

		}

		return path;

	}

	public String prepareFile(MyExam myExam2) {
		String str = "\n";
		String path="";
		FileOutputStream fout =null;
		try {
			 path = "D:\\testout" + myExam2.getExamId() + " " + ".txt";
			 fout = new FileOutputStream(path);
			str = myExam2.getExamDescrption() + "\n ";
			List<ExamReleatedQuestions> e = myExam2.getExamQuestions();

			for (ExamReleatedQuestions examReleatedQuestions : e) {
				str = str + examReleatedQuestions.getQuestionText() + " \n " + "\n "
						+ examReleatedQuestions.getOptionA() + " " + examReleatedQuestions.getOptionB() + " \n"
						+ examReleatedQuestions.getOptionC() + " " + examReleatedQuestions.getOptionD() + " \n"
						+ examReleatedQuestions.getCorrectAnswer() + " /n " + examReleatedQuestions.getTypeOfQuestion();
			}

			byte[] b = str.getBytes();// converting string into byte array
			fout.write(b);
			fout.close();
		} catch (Exception e) {
		throw new RuntimeErrorException(null, " "+e);
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
			}
		}
		return path;

	}
}

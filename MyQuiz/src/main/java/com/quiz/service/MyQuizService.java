package com.quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.quiz.entity.MyExam;
import com.quiz.entity.UserExamHistroy;
import com.quiz.repositry.ExamHistoryRepositry;
import com.quiz.repositry.MyQuizRepositry;

@Service
public class MyQuizService {

	@Autowired
	private Environment env;

	@Autowired
	private MyQuizRepositry myQuiz;

	@Autowired
	private ExamHistoryRepositry examHistoryRepositry;

	public List<MyExam> getExamList() {

		return myQuiz.findAll();

	}

	

	

	public MyExam getQuestionsByExamId(Integer examId) {

		Optional<MyExam> list = myQuiz.findById(examId);

		if(list.isPresent()) {
			return list.get();
		}else {
			return null;
		}
		
		

	}

	public void saveExamHistory(UserExamHistroy userExamHistroy) {

		if (userExamHistroy.getQuestionId() != 0) {

			examHistoryRepositry.save(userExamHistroy);
		}

	}

	public String submitExam(Integer examId) {
		List<UserExamHistroy> list = examHistoryRepositry.findByExamID(examId);
		int count = 0;
		int totalCount = list.size();
		for (UserExamHistroy userExamHistroy : list) {
			if (userExamHistroy.getCorrectAns().equalsIgnoreCase(userExamHistroy.getUserSelectdAns())) {
				count++;
			}
		}

		String result = "Dear User , You Got " + count + " Out of " + totalCount;
		return result;
	}

	public void deleteSubmitExam(Integer examId) {
		List<UserExamHistroy> list = examHistoryRepositry.findByExamID(examId);
		for (UserExamHistroy userExamHistroy : list) {
			examHistoryRepositry.delete(userExamHistroy);
		}
	}

}

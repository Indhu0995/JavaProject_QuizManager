package com.quiz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entity.ExamReleatedQuestions;
import com.quiz.entity.MyExam;
import com.quiz.repositry.ExamHistoryRepositry;
import com.quiz.repositry.MyQuizRepositry;

@Service
public class UtillService {

	@Autowired
	private MyQuizRepositry myQuiz;

	@Autowired
	private ExamHistoryRepositry examHistoryRepositry;

	public void save() {

		MyExam exam = new MyExam();
		exam.setExamDescrption("Java Language Basics Quiz");
		exam.setExamQuestions(preparingQuestions());
		myQuiz.save(exam);
		
		MyExam exam1 = new MyExam();
		exam1.setExamDescrption("General Knowledge Quiz");
		exam1.setExamQuestions(preparingQuestions2());
		myQuiz.save(exam1);
		
		MyExam exam2 = new MyExam();
		exam2.setExamDescrption("Job Interview Quiz");
		exam2.setExamQuestions(preparingQuestions3());
		myQuiz.save(exam2);
		
		MyExam exam3 = new MyExam();
		exam3.setExamDescrption("English to french Quiz");
		exam3.setExamQuestions(preparingQuestions4());
		myQuiz.save(exam3);
	}

	
	
	public List<ExamReleatedQuestions> preparingQuestions4() {

	List<ExamReleatedQuestions> examquestion = new ArrayList<ExamReleatedQuestions>();

	ExamReleatedQuestions examReleatedQuestions = new ExamReleatedQuestions();
	examReleatedQuestions.setQuestionText("Translate \"boat\" into french.");
	examReleatedQuestions.setOptionA("Bateau");
	examReleatedQuestions.setOptionB("brass");
	examReleatedQuestions.setOptionC("Baton");
	examReleatedQuestions.setOptionD("Baton");
	examReleatedQuestions.setTypeOfQuestion("MCQ");
	examReleatedQuestions.setCorrectAnswer("A");
	examquestion.add(examReleatedQuestions);
	
	
	ExamReleatedQuestions examReleatedQuestions1 = new ExamReleatedQuestions();
	examReleatedQuestions1.setQuestionText("Translate \"stick\" into french.");
	examReleatedQuestions1.setOptionA(" Baton");
	examReleatedQuestions1.setOptionB("Rat");
	examReleatedQuestions1.setOptionC(" Chauve-rat");
	examReleatedQuestions1.setOptionD("None of the above");
	examReleatedQuestions1.setTypeOfQuestion("MCQ");
	examReleatedQuestions1.setCorrectAnswer("C");
	examquestion.add(examReleatedQuestions1);

	ExamReleatedQuestions examReleatedQuestions2 = new ExamReleatedQuestions();
	examReleatedQuestions2.setQuestionText("Translate \"school\" into french.");
	examReleatedQuestions2.setOptionA("Apprendre");
	examReleatedQuestions2.setOptionB("Escole");
	examReleatedQuestions2.setOptionC("Ecolier");
	examReleatedQuestions2.setOptionD("Ecole");
	examReleatedQuestions2.setTypeOfQuestion("MCQ");
	examReleatedQuestions2.setCorrectAnswer("D");
	examquestion.add(examReleatedQuestions1);

	ExamReleatedQuestions examReleatedQuestions11 = new ExamReleatedQuestions();
	examReleatedQuestions11.setQuestionText("Translate \"olive\" into french.");
	examReleatedQuestions11.setOptionA("Oliver");
	examReleatedQuestions11.setOptionB("Olive");
	examReleatedQuestions11.setOptionC(
			"Olivier");
	examReleatedQuestions11.setOptionD("Olivard");
	examReleatedQuestions11.setTypeOfQuestion("MCQ");
	examReleatedQuestions11.setCorrectAnswer("B");
	examquestion.add(examReleatedQuestions11);

	ExamReleatedQuestions examReleatedQuestions3 = new ExamReleatedQuestions();
	examReleatedQuestions3.setQuestionText("Translate \"cat\" into french.");
	examReleatedQuestions3.setOptionA(
			"7");
	examReleatedQuestions3.setOptionB(
			"7");
	examReleatedQuestions3.setOptionC("7");
	examReleatedQuestions3.setOptionD("7");
	examReleatedQuestions3.setTypeOfQuestion("TEXT");
	examReleatedQuestions3.setCorrectAnswer("Cheveux");
	examquestion.add(examReleatedQuestions3);

	ExamReleatedQuestions examReleatedQuestions4 = new ExamReleatedQuestions();
	examReleatedQuestions4.setQuestionText("Translate \"man\" into french.");
	examReleatedQuestions4.setOptionA("TRUE");
	examReleatedQuestions4.setOptionB("Java is a low-level programming language and is platform independent.");
	examReleatedQuestions4.setOptionC("Java is a high-level programming language and is platform dependent.");
	examReleatedQuestions4.setOptionD("None of the above");
	examReleatedQuestions4.setTypeOfQuestion("TEXT");
	examReleatedQuestions4.setCorrectAnswer("Homme");
	examquestion.add(examReleatedQuestions4);

	ExamReleatedQuestions examReleatedQuestions5 = new ExamReleatedQuestions();
	examReleatedQuestions5.setQuestionText(" Translate \"book\" into french.");
	examReleatedQuestions5.setOptionA(" Den ");
	examReleatedQuestions5.setOptionB(" Bee-Lievre ");
	examReleatedQuestions5.setOptionC("Levre ");
	examReleatedQuestions5.setOptionD("Sevre ");
	examReleatedQuestions5.setTypeOfQuestion("MCQ");
	examReleatedQuestions5.setCorrectAnswer("A");
	examquestion.add(examReleatedQuestions5);

	ExamReleatedQuestions examReleatedQuestions6 = new ExamReleatedQuestions();
	examReleatedQuestions6.setQuestionText(" \"tadpole\" in french Tetard ?.");
	examReleatedQuestions6.setOptionA("Tongue ");
	examReleatedQuestions6.setOptionB("Lips");
	examReleatedQuestions6.setOptionC("Teeth ");
	examReleatedQuestions6.setOptionD("Nose ");
	examReleatedQuestions6.setTypeOfQuestion("Boolean");
	examReleatedQuestions6.setCorrectAnswer("TRUE");
	examquestion.add(examReleatedQuestions6);


	return examquestion;

}

	
public List<ExamReleatedQuestions> preparingQuestions2() {

		
		List<ExamReleatedQuestions> examquestion = new ArrayList<ExamReleatedQuestions>();

		ExamReleatedQuestions examReleatedQuestions = new ExamReleatedQuestions();
		examReleatedQuestions.setQuestionText("Which alloy is used in making of magnets?");
		examReleatedQuestions.setOptionA("nickel hydride");
		examReleatedQuestions.setOptionB("brass");
		examReleatedQuestions.setOptionC("permalloy");
		examReleatedQuestions.setOptionD("alnico");
		examReleatedQuestions.setTypeOfQuestion("MCQ");
		examReleatedQuestions.setCorrectAnswer("D");
		examquestion.add(examReleatedQuestions);
		
		
		ExamReleatedQuestions examReleatedQuestions1 = new ExamReleatedQuestions();
		examReleatedQuestions1.setQuestionText("In which one of following year UNO was formed?");
		examReleatedQuestions1.setOptionA(" 1945");
		examReleatedQuestions1.setOptionB("1952");
		examReleatedQuestions1.setOptionC(" 1965");
		examReleatedQuestions1.setOptionD("None of the above");
		examReleatedQuestions1.setTypeOfQuestion("MCQ");
		examReleatedQuestions1.setCorrectAnswer("A");
		examquestion.add(examReleatedQuestions1);

		ExamReleatedQuestions examReleatedQuestions2 = new ExamReleatedQuestions();
		examReleatedQuestions2.setQuestionText("UNO stands for");
		examReleatedQuestions2.setOptionA("Unit number");
		examReleatedQuestions2.setOptionB("Unless Noted Otherwise");
		examReleatedQuestions2.setOptionC("Universal Network Operations");
		examReleatedQuestions2.setOptionD("United Nations Organizations");
		examReleatedQuestions2.setTypeOfQuestion("MCQ");
		examReleatedQuestions2.setCorrectAnswer("D");
		examquestion.add(examReleatedQuestions1);

		ExamReleatedQuestions examReleatedQuestions11 = new ExamReleatedQuestions();
		examReleatedQuestions11.setQuestionText("Which one of following was first painting of an Italian painter named Michelangelo?");
		examReleatedQuestions11.setOptionA("Seasonal changes");
		examReleatedQuestions11.setOptionB("Last judgment");
		examReleatedQuestions11.setOptionC(
				" Forest and Sun");
		examReleatedQuestions11.setOptionD("Science fiction");
		examReleatedQuestions11.setTypeOfQuestion("MCQ");
		examReleatedQuestions11.setCorrectAnswer("B");
		examquestion.add(examReleatedQuestions11);

		ExamReleatedQuestions examReleatedQuestions3 = new ExamReleatedQuestions();
		examReleatedQuestions3.setQuestionText("Which one of following wrote Paradise Regained?");
		examReleatedQuestions3.setOptionA(
				"7");
		examReleatedQuestions3.setOptionB(
				"7");
		examReleatedQuestions3.setOptionC("7");
		examReleatedQuestions3.setOptionD("7");
		examReleatedQuestions3.setTypeOfQuestion("TEXT");
		examReleatedQuestions3.setCorrectAnswer("John Milton");
		examquestion.add(examReleatedQuestions3);

		ExamReleatedQuestions examReleatedQuestions4 = new ExamReleatedQuestions();
		examReleatedQuestions4.setQuestionText("Which one of following is known as father of modern Italy?");
		examReleatedQuestions4.setOptionA("TRUE");
		examReleatedQuestions4.setOptionB("Java is a low-level programming language and is platform independent.");
		examReleatedQuestions4.setOptionC("Java is a high-level programming language and is platform dependent.");
		examReleatedQuestions4.setOptionD("None of the above");
		examReleatedQuestions4.setTypeOfQuestion("TEXT");
		examReleatedQuestions4.setCorrectAnswer("G.Garibaldi");
		examquestion.add(examReleatedQuestions4);

		ExamReleatedQuestions examReleatedQuestions5 = new ExamReleatedQuestions();
		examReleatedQuestions5.setQuestionText(" Where does a lion live?");
		examReleatedQuestions5.setOptionA(" Den ");
		examReleatedQuestions5.setOptionB(" Bee-hives ");
		examReleatedQuestions5.setOptionC("Kennel ");
		examReleatedQuestions5.setOptionD("Burrow ");
		examReleatedQuestions5.setTypeOfQuestion("MCQ");
		examReleatedQuestions5.setCorrectAnswer("A");
		examquestion.add(examReleatedQuestions5);

		ExamReleatedQuestions examReleatedQuestions6 = new ExamReleatedQuestions();
		examReleatedQuestions6.setQuestionText("Which of the following organ is used to taste food?");
		examReleatedQuestions6.setOptionA("Tongue ");
		examReleatedQuestions6.setOptionB("Lips");
		examReleatedQuestions6.setOptionC("Teeth ");
		examReleatedQuestions6.setOptionD("Nose ");
		examReleatedQuestions6.setTypeOfQuestion("MCQ");
		examReleatedQuestions6.setCorrectAnswer("A");
		examquestion.add(examReleatedQuestions6);

		ExamReleatedQuestions examReleatedQuestions7 = new ExamReleatedQuestions();
		examReleatedQuestions7.setQuestionText("Baby of a dog is called_");
		examReleatedQuestions7.setOptionA("See");
		examReleatedQuestions7.setOptionB("public final double methoda();");
		examReleatedQuestions7.setOptionC("	static void methoda(double d1);");
		examReleatedQuestions7.setOptionD("None of the above");
		examReleatedQuestions7.setTypeOfQuestion("TEXT");
		examReleatedQuestions7.setCorrectAnswer("Puppy");
		examquestion.add(examReleatedQuestions7);

		ExamReleatedQuestions examReleatedQuestions8 = new ExamReleatedQuestions();
		examReleatedQuestions8.setQuestionText("Molecules are chemically bonded.");
		examReleatedQuestions8.setOptionA("Java is a high-level programming language and is platform independent.");
		examReleatedQuestions8.setOptionB("Java is a low-level programming language and is platform independent.");
		examReleatedQuestions8.setOptionC("Java is a high-level programming language and is platform dependent.");
		examReleatedQuestions8.setOptionD("None of the above");
		examReleatedQuestions8.setTypeOfQuestion("BOOLEAN");
		examReleatedQuestions8.setCorrectAnswer("TRUE");
		examquestion.add(examReleatedQuestions8);

		ExamReleatedQuestions examReleatedQuestions9 = new ExamReleatedQuestions();
		examReleatedQuestions9.setQuestionText(" Spiders have six legs.");
		examReleatedQuestions9.setOptionA("boolean b1 = 0;.");
		examReleatedQuestions9.setOptionB("boolean b2 = 'false';");
		examReleatedQuestions9.setOptionC("boolean b3 = false;");
		examReleatedQuestions9.setOptionD("None of the above");
		examReleatedQuestions9.setTypeOfQuestion("BOOLEAN");
		examReleatedQuestions9.setCorrectAnswer("TRUE");
		examquestion.add(examReleatedQuestions9);

		ExamReleatedQuestions examReleatedQuestions10 = new ExamReleatedQuestions();
		examReleatedQuestions10.setQuestionText("Kelvin is a measure of temperature.");
		examReleatedQuestions10.setOptionA("float f1 = -343;");
		examReleatedQuestions10.setOptionB("Jfloat f2 = 3.14;");
		examReleatedQuestions10.setOptionC("float f6 = 2.81F;");
		examReleatedQuestions10.setOptionD("None of the above");
		examReleatedQuestions10.setTypeOfQuestion("BOOLEAN");
		examReleatedQuestions10.setCorrectAnswer("TRUE");
		examquestion.add(examReleatedQuestions10);


		return examquestion;

	}


	
	
	
	
	
	
	
	public List<ExamReleatedQuestions> preparingQuestions() {

		List<ExamReleatedQuestions> examquestion = new ArrayList<ExamReleatedQuestions>();

		ExamReleatedQuestions examReleatedQuestions = new ExamReleatedQuestions();
		examReleatedQuestions.setQuestionText("What is JAVA?");
		examReleatedQuestions.setOptionA("Java is a high-level programming language and is platform independent.");
		examReleatedQuestions.setOptionB("Java is a low-level programming language and is platform independent.");
		examReleatedQuestions.setOptionC("Java is a high-level programming language and is platform dependent.");
		examReleatedQuestions.setOptionD("None of the above");
		examReleatedQuestions.setTypeOfQuestion("MCQ");
		examReleatedQuestions.setCorrectAnswer("A");
		examquestion.add(examReleatedQuestions);

		ExamReleatedQuestions examReleatedQuestions1 = new ExamReleatedQuestions();
		examReleatedQuestions1.setQuestionText(" How does Java enable high performance?");
		examReleatedQuestions1.setOptionA(" A single program works on different platforms without any modification");
		examReleatedQuestions1.setOptionB(
				"Java uses Just In  into bytecodes.");
		examReleatedQuestions1.setOptionC(" multiple threads by extending the thread class");
		examReleatedQuestions1.setOptionD("None of the above");
		examReleatedQuestions1.setTypeOfQuestion("MCQ");
		examReleatedQuestions1.setCorrectAnswer("B");
		examquestion.add(examReleatedQuestions1);

		ExamReleatedQuestions examReleatedQuestions2 = new ExamReleatedQuestions();
		examReleatedQuestions2.setQuestionText("What are the Java IDE’s?");
		examReleatedQuestions2.setOptionA("Chrome,Firefox");
		examReleatedQuestions2.setOptionB("Eclipse and NetBeans are the IDE's of JAVA");
		examReleatedQuestions2.setOptionC("Dell,Son");
		examReleatedQuestions2.setOptionD("None of the above");
		examReleatedQuestions2.setTypeOfQuestion("MCQ");
		examReleatedQuestions2.setCorrectAnswer("A");
		examquestion.add(examReleatedQuestions1);

		ExamReleatedQuestions examReleatedQuestions11 = new ExamReleatedQuestions();
		examReleatedQuestions11.setQuestionText("What is meant by Local variable");
		examReleatedQuestions11.setOptionA(
				" Local variables are defined in the method and scope .");
		examReleatedQuestions11.setOptionB("Java is a low-level programming language and is platform independent.");
		examReleatedQuestions11.setOptionC(
				"An instance variable is defined inside the class and outside the method ");
		examReleatedQuestions11.setOptionD("None of the above");
		examReleatedQuestions11.setTypeOfQuestion("MCQ");
		examReleatedQuestions11.setCorrectAnswer("A");
		examquestion.add(examReleatedQuestions11);

		ExamReleatedQuestions examReleatedQuestions3 = new ExamReleatedQuestions();
		examReleatedQuestions3.setQuestionText("What is meant by Instance variable?");
		examReleatedQuestions3.setOptionA(
				"An instance variable is defined inside the class and outside variables exist throughout the class.");
		examReleatedQuestions3.setOptionB(
				"Local variables are defined in the method and scope of the inside the method itself.");
		examReleatedQuestions3.setOptionC(" All Java codes are defined in a class. nd methods.");
		examReleatedQuestions3.setOptionD("None of the above");
		examReleatedQuestions3.setTypeOfQuestion("TEXT");
		examReleatedQuestions3.setCorrectAnswer("B");
		examquestion.add(examReleatedQuestions3);

		ExamReleatedQuestions examReleatedQuestions4 = new ExamReleatedQuestions();
		examReleatedQuestions4.setQuestionText("What is a Class?");
		examReleatedQuestions4.setOptionA("All Java codes are defined in a class. A Class has variables and methods.");
		examReleatedQuestions4.setOptionB("Java is a low-level programming language and is platform independent.");
		examReleatedQuestions4.setOptionC("Java is a high-level programming language and is platform dependent.");
		examReleatedQuestions4.setOptionD("None of the above");
		examReleatedQuestions4.setTypeOfQuestion("MCQ");
		examReleatedQuestions4.setCorrectAnswer("A");
		examquestion.add(examReleatedQuestions4);

		ExamReleatedQuestions examReleatedQuestions5 = new ExamReleatedQuestions();
		examReleatedQuestions5.setQuestionText("Which is a valid keyword in java?");
		examReleatedQuestions5.setOptionA("interface");
		examReleatedQuestions5.setOptionB("string");
		examReleatedQuestions5.setOptionC("Float");
		examReleatedQuestions5.setOptionD("unsigned");
		examReleatedQuestions5.setTypeOfQuestion("MCQ");
		examReleatedQuestions5.setCorrectAnswer("A");
		examquestion.add(examReleatedQuestions5);

		ExamReleatedQuestions examReleatedQuestions6 = new ExamReleatedQuestions();
		examReleatedQuestions6.setQuestionText("Which three are valid declarations of a char?");
		examReleatedQuestions6.setOptionA("char c1 = 064770");
		examReleatedQuestions6.setOptionB("char c2 = face");
		examReleatedQuestions6.setOptionC("char c3 = 0xbeef");
		examReleatedQuestions6.setOptionD("char c4 = u0022");
		examReleatedQuestions6.setTypeOfQuestion("MCQ");
		examReleatedQuestions6.setCorrectAnswer("A");
		examquestion.add(examReleatedQuestions6);

		ExamReleatedQuestions examReleatedQuestions7 = new ExamReleatedQuestions();
		examReleatedQuestions7.setQuestionText("Which is the valid declarations within an interface definition?");
		examReleatedQuestions7.setOptionA("public double methoda()");
		examReleatedQuestions7.setOptionB("public final double methoda();");
		examReleatedQuestions7.setOptionC("	static void methoda(double d1);");
		examReleatedQuestions7.setOptionD("None of the above");
		examReleatedQuestions7.setTypeOfQuestion("MCQ");
		examReleatedQuestions7.setCorrectAnswer("A");
		examquestion.add(examReleatedQuestions7);

		ExamReleatedQuestions examReleatedQuestions8 = new ExamReleatedQuestions();
		examReleatedQuestions8.setQuestionText("What is JAVA?");
		examReleatedQuestions8.setOptionA("Java is a high-level programming language and is platform independent.");
		examReleatedQuestions8.setOptionB("Java is a low-level programming language and is platform independent.");
		examReleatedQuestions8.setOptionC("Java is a high-level programming language and is platform dependent.");
		examReleatedQuestions8.setOptionD("None of the above");
		examReleatedQuestions8.setTypeOfQuestion("TEXT");
		examReleatedQuestions8.setCorrectAnswer("A");
		examquestion.add(examReleatedQuestions8);

		ExamReleatedQuestions examReleatedQuestions9 = new ExamReleatedQuestions();
		examReleatedQuestions9.setQuestionText("Which one is a valid declaration of a boolean?");
		examReleatedQuestions9.setOptionA("boolean b1 = 0;.");
		examReleatedQuestions9.setOptionB("boolean b2 = 'false';");
		examReleatedQuestions9.setOptionC("boolean b3 = false;");
		examReleatedQuestions9.setOptionD("None of the above");
		examReleatedQuestions9.setTypeOfQuestion("BOOLEAN");
		examReleatedQuestions9.setCorrectAnswer("TRUE");
		examquestion.add(examReleatedQuestions9);

		ExamReleatedQuestions examReleatedQuestions10 = new ExamReleatedQuestions();
		examReleatedQuestions10.setQuestionText("Which three are valid declarations of a float?");
		examReleatedQuestions10.setOptionA("float f1 = -343;");
		examReleatedQuestions10.setOptionB("Jfloat f2 = 3.14;");
		examReleatedQuestions10.setOptionC("float f6 = 2.81F;");
		examReleatedQuestions10.setOptionD("None of the above");
		examReleatedQuestions10.setTypeOfQuestion("MCQ");
		examReleatedQuestions10.setCorrectAnswer("D");
		examquestion.add(examReleatedQuestions10);

		return examquestion;

	}

	public List<ExamReleatedQuestions> preparingQuestions3() {

		
		List<ExamReleatedQuestions> examquestion = new ArrayList<ExamReleatedQuestions>();

		ExamReleatedQuestions examReleatedQuestions = new ExamReleatedQuestions();
		examReleatedQuestions.setQuestionText("How many months do we have in a year?");
		examReleatedQuestions.setOptionA("12 months.");
		examReleatedQuestions.setOptionB("11 months");
		examReleatedQuestions.setOptionC("13 months");
		examReleatedQuestions.setOptionD("None of the above");
		examReleatedQuestions.setTypeOfQuestion("MCQ");
		examReleatedQuestions.setCorrectAnswer("A");
		examquestion.add(examReleatedQuestions);
		
		
		ExamReleatedQuestions examReleatedQuestions1 = new ExamReleatedQuestions();
		examReleatedQuestions1.setQuestionText("How many days do we have in a week?");
		examReleatedQuestions1.setOptionA(" 7 days");
		examReleatedQuestions1.setOptionB("71 days");
		examReleatedQuestions1.setOptionC(" 4 days");
		examReleatedQuestions1.setOptionD("None of the above");
		examReleatedQuestions1.setTypeOfQuestion("MCQ");
		examReleatedQuestions1.setCorrectAnswer("A");
		examquestion.add(examReleatedQuestions1);

		ExamReleatedQuestions examReleatedQuestions2 = new ExamReleatedQuestions();
		examReleatedQuestions2.setQuestionText("How many days are there in a year?");
		examReleatedQuestions2.setOptionA("Chrome,Firefox");
		examReleatedQuestions2.setOptionB("365 days");
		examReleatedQuestions2.setOptionC("3652 days");
		examReleatedQuestions2.setOptionD("None of the above");
		examReleatedQuestions2.setTypeOfQuestion("MCQ");
		examReleatedQuestions2.setCorrectAnswer("B");
		examquestion.add(examReleatedQuestions1);

		ExamReleatedQuestions examReleatedQuestions11 = new ExamReleatedQuestions();
		examReleatedQuestions11.setQuestionText("What is 2+2?");
		examReleatedQuestions11.setOptionA("4");
		examReleatedQuestions11.setOptionB("Java is a low-level programming language and is platform independent.");
		examReleatedQuestions11.setOptionC(
				" method and scope of the variables exist throughout the class");
		examReleatedQuestions11.setOptionD("None of the above");
		examReleatedQuestions11.setTypeOfQuestion("TEXT");
		examReleatedQuestions11.setCorrectAnswer("4");
		examquestion.add(examReleatedQuestions11);

		ExamReleatedQuestions examReleatedQuestions3 = new ExamReleatedQuestions();
		examReleatedQuestions3.setQuestionText("Which number comes after 6?");
		examReleatedQuestions3.setOptionA(
				"7");
		examReleatedQuestions3.setOptionB(
				"7");
		examReleatedQuestions3.setOptionC("7");
		examReleatedQuestions3.setOptionD("7");
		examReleatedQuestions3.setTypeOfQuestion("TEXT");
		examReleatedQuestions3.setCorrectAnswer("7");
		examquestion.add(examReleatedQuestions3);

		ExamReleatedQuestions examReleatedQuestions4 = new ExamReleatedQuestions();
		examReleatedQuestions4.setQuestionText("Yogurt is produced by bacterial fermentation of milk");
		examReleatedQuestions4.setOptionA("TRUE");
		examReleatedQuestions4.setOptionB("Java is a low-level programming language and is platform independent.");
		examReleatedQuestions4.setOptionC("Java is a high-level programming language and is platform dependent.");
		examReleatedQuestions4.setOptionD("None of the above");
		examReleatedQuestions4.setTypeOfQuestion("BOOLEAN");
		examReleatedQuestions4.setCorrectAnswer("TRUE");
		examquestion.add(examReleatedQuestions4);

		ExamReleatedQuestions examReleatedQuestions5 = new ExamReleatedQuestions();
		examReleatedQuestions5.setQuestionText("The shape of DNA is known as? A double helix");
		examReleatedQuestions5.setOptionA("False");
		examReleatedQuestions5.setOptionB("string");
		examReleatedQuestions5.setOptionC("Float");
		examReleatedQuestions5.setOptionD("unsigned");
		examReleatedQuestions5.setTypeOfQuestion("BOOLEAN");
		examReleatedQuestions5.setCorrectAnswer("False");
		examquestion.add(examReleatedQuestions5);

		ExamReleatedQuestions examReleatedQuestions6 = new ExamReleatedQuestions();
		examReleatedQuestions6.setQuestionText("Electrons are larger than molecules.");
		examReleatedQuestions6.setOptionA("TRUE");
		examReleatedQuestions6.setOptionB("char c2 = face");
		examReleatedQuestions6.setOptionC("char c3 = 0xbeef");
		examReleatedQuestions6.setOptionD("char c4 = u0022");
		examReleatedQuestions6.setTypeOfQuestion("BOOLEAN");
		examReleatedQuestions6.setCorrectAnswer("TRUE");
		examquestion.add(examReleatedQuestions6);

		ExamReleatedQuestions examReleatedQuestions7 = new ExamReleatedQuestions();
		examReleatedQuestions7.setQuestionText("We use our eyes to — see, hear, feel, eat?");
		examReleatedQuestions7.setOptionA("See");
		examReleatedQuestions7.setOptionB("public final double methoda();");
		examReleatedQuestions7.setOptionC("	static void methoda(double d1);");
		examReleatedQuestions7.setOptionD("None of the above");
		examReleatedQuestions7.setTypeOfQuestion("TEXT");
		examReleatedQuestions7.setCorrectAnswer("See");
		examquestion.add(examReleatedQuestions7);

		ExamReleatedQuestions examReleatedQuestions8 = new ExamReleatedQuestions();
		examReleatedQuestions8.setQuestionText("How many colors are there in a rainbow?");
		examReleatedQuestions8.setOptionA("Java is a high-level programming language and is platform independent.");
		examReleatedQuestions8.setOptionB("Java is a low-level programming language and is platform independent.");
		examReleatedQuestions8.setOptionC("Java is a high-level programming language and is platform dependent.");
		examReleatedQuestions8.setOptionD("None of the above");
		examReleatedQuestions8.setTypeOfQuestion("TEXT");
		examReleatedQuestions8.setCorrectAnswer("7");
		examquestion.add(examReleatedQuestions8);

		ExamReleatedQuestions examReleatedQuestions9 = new ExamReleatedQuestions();
		examReleatedQuestions9.setQuestionText(" Sharks are mammals.");
		examReleatedQuestions9.setOptionA("boolean b1 = 0;.");
		examReleatedQuestions9.setOptionB("boolean b2 = 'false';");
		examReleatedQuestions9.setOptionC("boolean b3 = false;");
		examReleatedQuestions9.setOptionD("None of the above");
		examReleatedQuestions9.setTypeOfQuestion("BOOLEAN");
		examReleatedQuestions9.setCorrectAnswer("TRUE");
		examquestion.add(examReleatedQuestions9);

		ExamReleatedQuestions examReleatedQuestions10 = new ExamReleatedQuestions();
		examReleatedQuestions10.setQuestionText("Herbivores eat meat.");
		examReleatedQuestions10.setOptionA("float f1 = -343;");
		examReleatedQuestions10.setOptionB("Jfloat f2 = 3.14;");
		examReleatedQuestions10.setOptionC("float f6 = 2.81F;");
		examReleatedQuestions10.setOptionD("None of the above");
		examReleatedQuestions10.setTypeOfQuestion("BOOLEAN");
		examReleatedQuestions10.setCorrectAnswer("TRUE");
		examquestion.add(examReleatedQuestions10);


		return examquestion;

	}






}

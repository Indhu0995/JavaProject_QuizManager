package com.quiz.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.entity.MyExam;

public interface MyQuizRepositry extends JpaRepository<MyExam, Integer> {
	
	
	

}

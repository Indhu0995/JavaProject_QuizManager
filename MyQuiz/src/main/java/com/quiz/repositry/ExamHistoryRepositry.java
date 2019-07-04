package com.quiz.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.quiz.entity.UserExamHistroy;

public interface ExamHistoryRepositry extends JpaRepository<UserExamHistroy, Integer> {

	@Query("select userExamHistroy from com.quiz.entity.UserExamHistroy userExamHistroy where userExamHistroy.examId= :examId")
	public List<UserExamHistroy> findByExamID(Integer examId);
}

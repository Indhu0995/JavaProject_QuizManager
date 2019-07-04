package com.quiz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserExamHistroy")
public class UserExamHistroy {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userExamHistroy;

	@Column
	private String correctAns;

	@Column
	private String userSelectdAns;

	@Column
	private Integer examId;

	@Column
	private Integer questionId;

	/**
	 * @return the userExamHistroy
	 */
	public Integer getUserExamHistroy() {
		return userExamHistroy;
	}

	/**
	 * @param userExamHistroy the userExamHistroy to set
	 */
	public void setUserExamHistroy(Integer userExamHistroy) {
		this.userExamHistroy = userExamHistroy;
	}

	/**
	 * @return the correctAns
	 */
	public String getCorrectAns() {
		return correctAns;
	}

	/**
	 * @param correctAns the correctAns to set
	 */
	public void setCorrectAns(String correctAns) {
		this.correctAns = correctAns;
	}

	/**
	 * @return the userSelectdAns
	 */
	public String getUserSelectdAns() {
		return userSelectdAns;
	}

	/**
	 * @param userSelectdAns the userSelectdAns to set
	 */
	public void setUserSelectdAns(String userSelectdAns) {
		this.userSelectdAns = userSelectdAns;
	}

	/**
	 * @return the examId
	 */
	public Integer getExamId() {
		return examId;
	}

	/**
	 * @param examId the examId to set
	 */
	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	/**
	 * @return the questionId
	 */
	public Integer getQuestionId() {
		return questionId;
	}

	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserExamHistroy [userExamHistroy=");
		builder.append(userExamHistroy);
		builder.append(", correctAns=");
		builder.append(correctAns);
		builder.append(", userSelectdAns=");
		builder.append(userSelectdAns);
		builder.append(", examId=");
		builder.append(examId);
		builder.append(", questionId=");
		builder.append(questionId);
		builder.append("]");
		return builder.toString();
	}

}

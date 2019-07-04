package com.quiz.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MyExam")
public class MyExam {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer examId;
	
	@Column
	private String examDescrption;


	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "examId", referencedColumnName = "examId")
	private List<ExamReleatedQuestions> examQuestions;

	
	
	
	
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
	 * @return the examDescrption
	 */
	public String getExamDescrption() {
		return examDescrption;
	}

	/**
	 * @param examDescrption the examDescrption to set
	 */
	public void setExamDescrption(String examDescrption) {
		this.examDescrption = examDescrption;
	}


	/**
	 * @return the examQuestions
	 */
	public List<ExamReleatedQuestions> getExamQuestions() {
		return examQuestions;
	}

	/**
	 * @param examQuestions the examQuestions to set
	 */
	public void setExamQuestions(List<ExamReleatedQuestions> examQuestions) {
		this.examQuestions = examQuestions;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyExam [examId=");
		builder.append(examId);
		builder.append(", examDescrption=");
		builder.append(examDescrption);
		builder.append(", examQuestions=");
		builder.append(examQuestions);
		builder.append("]");
		return builder.toString();
	}

}

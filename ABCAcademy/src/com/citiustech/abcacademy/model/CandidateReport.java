package com.citiustech.abcacademy.model;

import java.util.List;

public class CandidateReport {

	private int candidateId;
	private String candidateName;
	private int mark1;
	private int mark2;
	private int mark3;
	private char result;
	private String grade;
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public int getMark1() {
		return mark1;
	}
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	public int getMark3() {
		return mark3;
	}
	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}
	public char getResult() {
		return result;
	}
	public void setResult(char result) {
		this.result = result;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public CandidateReport(int candidateId, String candidateName, int mark1, int mark2, int mark3,
			char result, String grade) {
		super();
		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.result = result;
		this.grade = grade;
	}
	public CandidateReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CandidateReport [candidateId=" + candidateId + ", candidateName=" + candidateName + ", mark1=" + mark1
				+ ", mark2=" + mark2 + ", mark3=" + mark3 + ", result=" + result + ", grade=" + grade + "]";
	}
	
	
	
}

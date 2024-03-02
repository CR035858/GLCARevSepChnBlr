package com.gl.students.model;

import java.util.Arrays;

public class Student {
	
	String studId;
	String studName;
	String studAddress;
	int[] scores=new int[5];
	
	public Student() {
		super();
		
	}

	public Student(String studId, String studName, String studAddress, int[] scores) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAddress = studAddress;
		this.scores = scores;
	}

	public String getStudId() {
		return studId;
	}

	public void setStudId(String studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudAddress() {
		return studAddress;
	}

	public void setStudAddress(String studAddress) {
		this.studAddress = studAddress;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studAddress=" + studAddress + ", scores="
				+ Arrays.toString(scores) + "]";
	}
	
	

}

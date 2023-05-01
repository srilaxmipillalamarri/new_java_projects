package com.entity;

import javax.persistence.*;


@Entity(name="studentinfo")
@Table(name="student_table")
public class Student {
	@Id
	@Column(name="roll_no")
	private int rollNo;
	@Column(name="std_name",length=20)
	private String stdName;
	@Column(name="avg_marks")
	private double avgMarks;
	public Student(int rollNo, String stdName, double avgMarks) {
		super();
		this.rollNo = rollNo;
		this.stdName = stdName;
		this.avgMarks = avgMarks;
	}
	public Student() {
		super();
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public double getAvgMarks() {
		return avgMarks;
	}
	public void setAvgMarks(double avgMarks) {
		this.avgMarks = avgMarks;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", stdName=" + stdName + ", avgMarks=" + avgMarks + "]";
	}
	

}

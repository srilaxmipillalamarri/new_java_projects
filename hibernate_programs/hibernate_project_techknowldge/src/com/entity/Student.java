package com.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="StudentInfo")
public class Student 
{

   @Id
   @Column(name="roll_number")
   private int rollNumber;
   
   @Column(name="student_name",length=20)
   private String studentName;
   
   @Column(name="avg_marks")
   private double avgMarks;
   
   public Student(){  }
   
   public Student(int rollNumber,String studentName,double avgMarks)
   {
	   this.rollNumber = rollNumber;
	   this.studentName = studentName;
	   this.avgMarks = avgMarks;
   }

  public int getRollNumber() 
  {
	return rollNumber;
  }

  public void setRollNumber(int rollNumber) 
  {
	this.rollNumber = rollNumber;
  }

  public String getStudentName() 
  {
	return studentName;
  }

  public void setStudentName(String studentName) {
	this.studentName = studentName;
  }

  public double getAvgMarks() {
	return avgMarks;
   }

  public void setAvgMarks(double avgMarks) {
	this.avgMarks = avgMarks;
  }

@Override
public String toString() {
	return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", avgMarks=" + avgMarks + "]";
}   
  
   
}






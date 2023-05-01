package com.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Student;
import com.hibernateutil.HibernateUtil;
import java.util.*;

public class MainApp 
{
	public static void addStudent()
	{
		Session ss = 
				HibernateUtil
				.getMySessionFactory()
				.openSession();
		Transaction trans = null;
		try
		{
			trans = ss.beginTransaction();
			Student st = 
				new Student(1313,"kala",88.88);
			ss.save(st);  //insert operation
			trans.commit();
			System.out.println(
					"Success!Object has been added");
			ss.close();
		}
		catch(HibernateException he)
		{
			System.out.println(he.toString());
			trans.rollback();
		}
		
	}
	public static void updateStudent()
	{
		Session ss = 
				HibernateUtil
				.getMySessionFactory()
				.openSession();
		Transaction trans = null;
		try
		{
			trans = ss.beginTransaction();
			Student x=(Student)ss.get(Student.class, 1313);
			x.setStudentName("nari");
			x.setAvgMarks(100.00);
			ss.update(x);
			trans.commit();
			System.out.println("sussfully updated");
			ss.close();
		}
		catch(HibernateException he) {
			System.out.println(he);
		}
		
		
	}
	public static void deleteStudent() {
		Session ss = 
				HibernateUtil
				.getMySessionFactory()
				.openSession();
		Transaction trans = null;
		try
		{
			trans = ss.beginTransaction();
			Student x=(Student)ss.get(Student.class,1515);
	        System.out.println("deleted");
	        ss.close();
		}
		catch(HibernateException he) {
			System.out.println(he);
		}
		
	}
	
	public static void showAllStudents() {
		Session ss = 
				HibernateUtil
				.getMySessionFactory()
				.openSession();
		List studentList=null;
		try {
			studentList=ss.createQuery("from com.entity.Student").list();
			System.out.println("studentinfo");
			for(Object ob:studentList) {
				Student x=(Student)ob;
				System.out.println(x);
			}
		}
		catch(HibernateException he) {
			System.out.println(he);
		}
		
		
		
	}

	public static void main(String[] args)
	{
		//addStudent();
		//updateStudent();
		//deleteStudent();
		showAllStudents();
	}

}

package com.main;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.entity.Student;

public class MainApp {
	
	
	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory;
        sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        Student st= new Student(1,"sri",89.00);
        session.save(st);
        tr.commit();
        session.close();
        
	}

}

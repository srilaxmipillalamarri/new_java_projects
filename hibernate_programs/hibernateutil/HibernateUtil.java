package com.hibernateutil;
import com.entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class HibernateUtil {
	

	private static final SessionFactory sf;
	
	static {
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Student.class);
		cfg.configure();
		StandardServiceRegistryBuilder builder= new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
		sf=cfg.buildSessionFactory(builder.build());
	}
	public static SessionFactory getMySessionFactory() {
		return sf;
		
		
	}
}

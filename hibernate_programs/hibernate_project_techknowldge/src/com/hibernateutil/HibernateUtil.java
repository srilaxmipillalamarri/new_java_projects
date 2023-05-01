package com.hibernateutil;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

//our own utility class
public class HibernateUtil
{
	//implement Singleton Design Pattern
	private static final SessionFactory sf;
	
	//a static block will be executed for only
	//once in the life time of the whole
	//application
	//a static block automatically invoked
	//as soon as application is loaded
	static
	{
		//get the whole configuration from
		//hibernate.cfg.xml into Java
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(
				com.entity.Student.class);
		cfg.configure();
		
		//build service registry to provide
		//security to the database
		StandardServiceRegistryBuilder builder= 
				new StandardServiceRegistryBuilder()
					 .applySettings(cfg.getProperties());
		
		//now create the session factory object
		sf = cfg.buildSessionFactory(builder.build());
		
	}
	
	public static SessionFactory getMySessionFactory()
    {
   	 return sf;
    }

}

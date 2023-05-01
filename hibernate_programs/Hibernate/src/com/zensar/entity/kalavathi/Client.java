package com.zensar.entity.kalavathi;

/*import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

*/

/*public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product pt=new Product();
pt.setpId(2);
pt.setpName("medimix");
pt.setpCost(50);
pt.setpLoc("vij");
System.out.println(pt);



SessionFactory factory=new Configuration().configure().buildSessionFactory();

Session session = factory.openSession();

session.save(pt);

System.out.println("product saved successfully!!!");
Transaction transaction = session.beginTransaction();

transaction.commit();
session.close();
factory.close();
}
}*/

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import com.zensar.entity.srilaxmi.Address;
import com.zensar.entity.srilaxmi.Student;

public class Client {
	public static void main(String args[]) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Student student = new Student();
		student.setStudentId(2);
		student.setStudentName("laxmi");
		student.setStudentAge(24);
		
		Address address1 = new Address(103, "A.P", "Kakinada");
		Address address2 = new Address(105, "A.P", "Kakinada");
		List<Address> address = new ArrayList<Address>();
		address.add(address1);
		address.add(address2);
		student.setAddress(address);
		Transaction transaction = session.beginTransaction();

		session.save(address1);
		session.save(address2);
		session.save(student);

		transaction.commit();

		session.close();
		factory.close();
	}
}

package com.edu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args) {
		 Configuration con= new Configuration().configure().addAnnotatedClass(Employee.class);
		 ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		 SessionFactory factory= con.buildSessionFactory(reg);
		 Session session= factory.openSession();
		 Transaction tn= session.beginTransaction();
		 
		 Address address=new Address("Kanchipuram","TamilNadu");
		 Employee emp=new Employee(12,"Meera",address);
		 session.save(emp);
		 tn.commit();
		 session.close();
	}

}

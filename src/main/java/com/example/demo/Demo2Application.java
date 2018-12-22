package com.example.demo;

import java.util.Date;

import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
		
		
		Session session = HibernateUtil.sessionFactory().openSession();
		
		session.beginTransaction();
		
		Clazz_Hibernate clazz_Hibernate = new Clazz_Hibernate();
		clazz_Hibernate.setName("DEF");
		
		Student_Hibernate student_Hibernate = new Student_Hibernate();
		student_Hibernate.setName("Tra");
		student_Hibernate.setCode("123");
		student_Hibernate.setDateofBirth(new Date());
		student_Hibernate.setEmail("nguyen@gmail.com");
		student_Hibernate.setClazzId(Long.valueOf(1));
		
		
		session.save(student_Hibernate);
		session.save(clazz_Hibernate);
		
		session.getTransaction().commit();
		
		
		
	}
}

package com.deepak.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deepak.pojo.Student;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appcontext = new ClassPathXmlApplicationContext(
				"appcontext.xml");
		Student s1 = (Student) appcontext.getBean("studentProxy");
		s1.printName("Argument to function");
		s1.printRoll();
		s1.throwExcetion();
		System.out.println(s1);
		appcontext.close();
	}

}

package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//        System.out.println( "Hello World!" );

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Students s1 = (Students) context.getBean("student1");		
		System.out.println(s1);
		
		Students s2 = (Students) context.getBean("student2");		
		System.out.println(s2);
		
		Students s3 = (Students) context.getBean("student3");		
		System.out.println(s3);

	}
}

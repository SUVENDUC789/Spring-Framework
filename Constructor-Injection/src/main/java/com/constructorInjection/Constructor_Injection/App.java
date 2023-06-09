package com.constructorInjection.Constructor_Injection;

//package com.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Students student1 = (Students) context.getBean("student1");
		System.out.println(student1);

		Example ob1 = (Example) context.getBean("myexampleobj");
		ob1.doSum();
	}
}

package com.springcore.steretype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/steretype/stereoconfig.xml");

		Student s1 = context.getBean("student", Student.class);
		System.out.println(s1);
		System.out.println(s1.getAddress());
		System.out.println(s1.getAddress().getClass().getName());

	}

}

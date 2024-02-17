package com.springcore.auto.wire;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");

		Emp e1 = context.getBean("emp1",Emp.class);
		System.out.println(e1);



	}

}

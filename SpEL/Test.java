package com.springcore.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;
import org.springframework.expression.spel.standard.*;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");

		Demo d1 = context.getBean("demo",Demo.class);
		System.out.println(d1);
//         
//		SpelExpressionParser temp=new SpelExpressionParser();
//		Expression exp=(Expression) temp.parseExpression("22+22");
//		System.out.println(exp);
		
		
		


	}

}

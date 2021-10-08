package com.springframework;

import com.shihp.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person bean = applicationContext.getBean(Person.class);
		System.out.println(bean);
	}
}

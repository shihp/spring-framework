package com.springframework;

import com.shihp.MyClassPathPathXmlApplicationContext;
import com.shihp.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-${user}.xml");
		ApplicationContext applicationContext = new MyClassPathPathXmlApplicationContext("applicationContext.xml");
		Person bean = applicationContext.getBean(Person.class);
		System.out.println(bean);
	}
}

package com.springframework;


import com.shihp.MyClassPathPathXmlApplicationContext;
import com.shihp.selftag.User;
import org.springframework.context.ApplicationContext;

public class Test {
	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-${user}.xml");
		ApplicationContext applicationContext = new MyClassPathPathXmlApplicationContext("applicationContext.xml");
//		Person bean = applicationContext.getBean(Person.class);
		User user = applicationContext.getBean(User.class);
		System.out.println(user.getUserName());
	}
}

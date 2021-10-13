package com.springframework;


import com.shihp.MyClassPathPathXmlApplicationContext;
import com.shihp.Person;
import com.shihp.selfEditor.Customer;
import com.shihp.selftag.User;
import org.springframework.context.ApplicationContext;

public class Test {
	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-${user}.xml");
		//测试自定义xml标签
//		ApplicationContext applicationContext = new MyClassPathPathXmlApplicationContext("applicationContext.xml");
//		Person bean = applicationContext.getBean(Person.class);
		//测试自定义编辑器
//		ApplicationContext applicationContext = new MyClassPathPathXmlApplicationContext("selfEditor.xml");
//		Customer customer = applicationContext.getBean(Customer.class);
		ApplicationContext applicationContext = new MyClassPathPathXmlApplicationContext("applicationContext.xml");
		Person bean = applicationContext.getBean(Person.class);
		System.out.println("customer = " + bean);
	}
}

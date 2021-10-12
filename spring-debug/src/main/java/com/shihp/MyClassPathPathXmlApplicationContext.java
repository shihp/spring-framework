package com.shihp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathPathXmlApplicationContext  extends ClassPathXmlApplicationContext {
	public MyClassPathPathXmlApplicationContext(String... configLocations) throws BeansException {
		super(configLocations);
	}

	//进行任何扩展
	@Override
	protected void initPropertySources() {
		System.out.println("扩展 init property");
		getEnvironment().setRequiredProperties("user");
		getEnvironment().validateRequiredProperties();
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		beanFactory.setAllowCircularReferences(false);
		beanFactory.setAllowBeanDefinitionOverriding(false);
		super.customizeBeanFactory(beanFactory);
	}
}

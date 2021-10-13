package com.shihp.selfAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.*;

import java.security.AccessControlContext;

/**
 * 定义一个myAwareProcessor实现BeanPostProcessor
 * 在postProcessBeforeInitialization，可以设置其他属性值
 */
public class MyAwareProcessor implements BeanPostProcessor {
	private final ConfigurableApplicationContext applicationContext;

	public MyAwareProcessor(ConfigurableApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	// postProcessBeforeInitialization时调用
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		AccessControlContext acc = null;

		if (System.getSecurityManager() != null) {
			acc = this.applicationContext.getBeanFactory().getAccessControlContext();
		}
		//仿照 invokeAwareMethods
		((ApplicationContextAware) bean).setApplicationContext(this.applicationContext);

		return bean;	}
}

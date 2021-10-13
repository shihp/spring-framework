package com.shihp;

import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;

public class MyBeanDefinitionRegistry implements BeanDefinitionRegistry {
	@Override
	public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws BeanDefinitionStoreException {

	}

	@Override
	public void removeBeanDefinition(String beanName) throws NoSuchBeanDefinitionException {

	}

	@Override
	public BeanDefinition getBeanDefinition(String beanName) throws NoSuchBeanDefinitionException {
		return null;
	}

	@Override
	public boolean containsBeanDefinition(String beanName) {
		return false;
	}

	@Override
	public String[] getBeanDefinitionNames() {
		return new String[0];
	}

	@Override
	public int getBeanDefinitionCount() {
		return 0;
	}

	@Override
	public boolean isBeanNameInUse(String beanName) {
		return false;
	}

	@Override
	public void registerAlias(String name, String alias) {

	}

	@Override
	public void removeAlias(String alias) {

	}

	@Override
	public boolean isAlias(String name) {
		return false;
	}

	@Override
	public String[] getAliases(String name) {
		return new String[0];
	}
}

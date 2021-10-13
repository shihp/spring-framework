package com.shihp.selftag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * 仿照 * {@link org.springframework.context.config.PropertyPlaceholderBeanDefinitionParser}
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {


	// 获取属性值所对应的对象
	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}


	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		// 获取标签具体的属性值
		String id = element.getAttribute("id");
		String userName = element.getAttribute("username");
		String email = element.getAttribute("email");
		String password = element.getAttribute("password");

		if (StringUtils.hasText(id)) {
			builder.addPropertyValue("id", id);
		}

		if (StringUtils.hasText(userName)) {
			builder.addPropertyValue("userName", userName);
		}

		if (StringUtils.hasText(email)) {
			builder.addPropertyValue("email", email);
		}

		if (StringUtils.hasText(password)) {
			builder.addPropertyValue("password", password);
		}
	}
}

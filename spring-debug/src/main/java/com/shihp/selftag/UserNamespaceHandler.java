package com.shihp.selftag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 *
 * 仿照 {@link org.springframework.context.config.ContextNamespaceHandler}
 */
public class UserNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
	}
}

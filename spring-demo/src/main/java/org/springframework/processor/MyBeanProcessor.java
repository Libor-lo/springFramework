package org.springframework.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanProcessor implements BeanPostProcessor {


	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("the bean " + beanName + " has been postProcessBeforeInitialized......");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("the bean " + beanName + " has been postProcessAfterInitialized......");
		return bean;
	}

	public MyBeanProcessor(){
		System.out.println("MyBeanProcessor is init ......");
	}
}

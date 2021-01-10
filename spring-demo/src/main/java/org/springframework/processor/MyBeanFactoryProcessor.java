package org.springframework.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.Iterator;

public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		Iterator<String> beanNamesIterator = beanFactory.getBeanNamesIterator();
		if (beanNamesIterator.hasNext()) {
			System.out.println(beanNamesIterator.next());
		}
	}

	public MyBeanFactoryProcessor(){
		System.out.println("MyBeanFactoryProcessor is init ......");
	}

}

package com.prowings.beanlifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanLifeCycleWithAnnotations {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycleWithAnnotations.xml");
		
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println(emp);
		
		context.close();

		
	}

}

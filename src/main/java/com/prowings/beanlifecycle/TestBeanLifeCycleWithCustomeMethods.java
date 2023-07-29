package com.prowings.beanlifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanLifeCycleWithCustomeMethods {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycle.xml");
		
//		Student std = context.getBean("std1", Student.class);
//		System.out.println(std);
		
		Student2 std2 = context.getBean("std2", Student2.class);
		System.out.println(std2);
		
		context.close();

	}

}

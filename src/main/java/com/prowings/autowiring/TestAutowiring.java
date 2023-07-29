package com.prowings.autowiring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiring {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowiringSpringBeans.xml");
		
		Student std = context.getBean("std1", Student.class); // //
		System.out.println(std);
		 
//		Student std2 = context.getBean("std2", Student.class);
//		
//		System.out.println(std2);
		
		System.out.println("total beans in container : "+ context.getBeanDefinitionCount());
		
		String [] beanNames = context.getBeanDefinitionNames();
		
		System.out.println("beans names are : "+Arrays.toString(beanNames));	
		
		int addrBeanCount = context.getBeanNamesForType(Address.class).length;
		
		System.out.println("Total number of address beans : "+addrBeanCount);
	}

}

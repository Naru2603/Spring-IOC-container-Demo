package com.prowings.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prowings.circulardependancy.Address;
import com.prowings.circulardependancy.Person;

public class TestCircularDependancyResolution {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("CircularDependancySpringBeans.xml");
		
		Person per1= context.getBean("person2", Person.class);
		
		System.out.println(per1);
		
		Address adr1 = context.getBean("addr2", Address.class);
		
		System.out.println(adr1);
	}

}

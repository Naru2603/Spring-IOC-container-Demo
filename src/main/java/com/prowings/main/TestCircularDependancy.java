package com.prowings.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prowings.circulardependancy.Address;
import com.prowings.circulardependancy.Person;

public class TestCircularDependancy {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("CircularDependancySpringBeans.xml");
		
		Person per= context.getBean("person", Person.class);
		
		System.out.println(per);
		
		Address adr = context.getBean("addr", Address.class);
		
		System.out.println(adr);
	}

}

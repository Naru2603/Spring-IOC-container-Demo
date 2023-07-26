package com.prowings.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prowings.models.Person;

public class TestCollectionInjection {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("CollectionInjectionSpringBeans.xml");
		
		Person person =context.getBean("person1", Person.class);
		System.out.println(person);

	}

}

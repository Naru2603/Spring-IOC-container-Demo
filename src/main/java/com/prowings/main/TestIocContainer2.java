package com.prowings.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prowings.models.Employee;
import com.prowings.models.Laptop;
import com.prowings.models.Student;

public class TestIocContainer2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springBeans2.xml");
		
		Laptop laptop =context.getBean("lapppy", Laptop.class);
		
		
		System.out.println(laptop);

	}

}

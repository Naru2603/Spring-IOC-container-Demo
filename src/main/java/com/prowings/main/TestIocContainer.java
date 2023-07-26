package com.prowings.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prowings.models.Employee;
import com.prowings.models.Student;

public class TestIocContainer {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");
		
		Student std1 = context.getBean("std1", Student.class);
		
		Student std2 = context.getBean("std2", Student.class);
		
		
		System.out.println(std1);
		System.out.println(std2);
		
		Employee emp = context.getBean("emp1", Employee.class);
		
		System.out.println(emp);


	}

}

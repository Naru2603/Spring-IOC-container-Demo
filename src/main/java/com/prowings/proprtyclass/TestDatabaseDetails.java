package com.prowings.proprtyclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDatabaseDetails {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("DatabasePropertiesSpringBeans.xml");
		
		MyDatabaseDetails db = context.getBean("dbDetails", MyDatabaseDetails.class );
		
		System.out.println(db);
		
		

	}

}

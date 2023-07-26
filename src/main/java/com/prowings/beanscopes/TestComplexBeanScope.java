package com.prowings.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComplexBeanScope {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ComplexBeanScopeProblemSpringBeans.xml");
		
		 FourWheeler fw = context.getBean("fourWheeler", FourWheeler.class);
		 
		 FourWheeler fw1 = context.getBean("fourWheeler", FourWheeler.class);
		 
		 System.out.println(fw);
		 System.out.println(fw1);
		 
		 System.out.println(fw == fw1);

		 System.out.println(fw.getEngine() == fw1.getEngine());
	}

}

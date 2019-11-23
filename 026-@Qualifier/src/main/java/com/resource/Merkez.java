package com.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		Ders ders = context.getBean("beanDers", Ders.class);		
		System.out.println(ders);
		
		
		
	}

}

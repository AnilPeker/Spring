package com.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		Ogrenci ogrenci = context.getBean("beanOgrenci",Ogrenci.class);
		
		System.out.println(ogrenci);
		
		
		
	}

}

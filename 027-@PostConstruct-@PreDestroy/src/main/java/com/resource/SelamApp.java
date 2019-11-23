package com.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SuppressWarnings("resource")
public class SelamApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");

		Selam selam = context.getBean("beanSelam1",Selam.class);
		selam.setMesaj("Anil Peker");
		selam.goster();		
		((AbstractApplicationContext) context).registerShutdownHook();
		
		
	}

}

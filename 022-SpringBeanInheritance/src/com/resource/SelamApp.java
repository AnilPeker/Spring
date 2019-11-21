package com.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SuppressWarnings("resource")
public class SelamApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Selam selamNesnesi =  context.getBean("beanSelam", Selam.class);		
		//selamNesnesi.goster();
	
		Yazar yazarNesnesi  =  context.getBean("beanYazar", Yazar.class);	
		yazarNesnesi.goster();
		
		((AbstractApplicationContext) context).registerShutdownHook();

		
		
	}

}

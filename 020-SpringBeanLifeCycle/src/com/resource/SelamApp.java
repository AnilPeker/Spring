package com.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SuppressWarnings("resource")
public class SelamApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		Selam selam = context.getBean("beanSelam1",Selam.class);
		selam.setMesaj("Anil Peker");
		selam.goster();
		Selam selam2 = context.getBean("beanSelam1",Selam.class); 
		selam.setMesaj("Tugce Zaferler");
		
		System.out.println(context.getBean("beanSelam1",Selam.class));
		System.out.println(context.getBean("beanSelam1",Selam.class));
		System.out.println(context.getBean("beanSelam1",Selam.class));
		System.out.println(context.getBean("beanSelam1",Selam.class));
		System.out.println(context.getBean("beanSelam1",Selam.class));
		
		((AbstractApplicationContext) context).registerShutdownHook();
		
		
	}

}

package com.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SuppressWarnings("resource")
public class SelamApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
//		Prototype sana her serferinde farkl� nesne verir.
		Selam selam = context.getBean("beanSelam",Selam.class);
		selam.setMesaj("Anil Peker");
		selam.goster();
		
		Selam selam2 = context.getBean("beanSelam",Selam.class); 
		selam2.goster();
		// G�r�nd��� gibi her object farkl�d�r.Ama her �al��t�rd���nda objelerin referans� de�i�mez de�i�mez.
		System.out.println(context.getBean("beanSelam",Selam.class));
		System.out.println(context.getBean("beanSelam",Selam.class));
		System.out.println(context.getBean("beanSelam",Selam.class));
		System.out.println(context.getBean("beanSelam",Selam.class));
		System.out.println(context.getBean("beanSelam",Selam.class));

	}

}

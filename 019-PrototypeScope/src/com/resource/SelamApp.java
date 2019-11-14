package com.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SuppressWarnings("resource")
public class SelamApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
//		Prototype sana her serferinde farklý nesne verir.
		Selam selam = context.getBean("beanSelam",Selam.class);
		selam.setMesaj("Anil Peker");
		selam.goster();
		
		Selam selam2 = context.getBean("beanSelam",Selam.class); 
		selam2.goster();
		// Göründüðü gibi her object farklýdýr.Ama her çalýþtýrdýðýnda objelerin referansý deðiþmez deðiþmez.
		System.out.println(context.getBean("beanSelam",Selam.class));
		System.out.println(context.getBean("beanSelam",Selam.class));
		System.out.println(context.getBean("beanSelam",Selam.class));
		System.out.println(context.getBean("beanSelam",Selam.class));
		System.out.println(context.getBean("beanSelam",Selam.class));

	}

}

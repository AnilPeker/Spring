package com.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SuppressWarnings("resource")
public class SelamApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		Selam selam = context.getBean("beanSelam",Selam.class);
		selam.setMesaj("Anil Peker");
		selam.goster();
		
		Selam selam2 = context.getBean("beanSelam",Selam.class); //eger deger vermez isen burdaki deðer ilk nesne ile aynýdýr
		selam2.goster();
		
		/*Calisan calisan = context.getBean("beanCalisan", Calisan.class);
		System.out.println(calisan.toString());*/

	}

}

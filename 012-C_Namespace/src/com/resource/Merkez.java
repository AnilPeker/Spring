package com.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SuppressWarnings("resource")
public class Merkez {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		Calisan calisan = context.getBean("beanCalisan", Calisan.class);
		
		System.out.println("Adi:" + calisan.getAdi());
		System.out.println("Soyadi:" + calisan.getSoyadi());
		System.out.println("Yaþý:" + calisan.getYasi());
		System.out.println("Mahalle:" + calisan.getAdres().getMahalle());
		System.out.println("Semt:" + calisan.getAdres().getSemt());
		System.out.println("Sehir:" + calisan.getAdres().getSehir());

	}

}

package com.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SuppressWarnings("resource")
public class Merkez {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Ogrenci ogrenci = (Ogrenci) context.getBean("beanOgrenci");
		
		System.out.println("Adý:      " + ogrenci.getAdi());
		System.out.println("Soyadý:   " + ogrenci.getSoyadi());
		System.out.println("Numarasý: " + ogrenci.getNumarasi());
		System.out.println("KurumAdý: " + ogrenci.getUniversitesi().getKurumAdi());
	}

}

package com.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SuppressWarnings("resource")
public class Merkez {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		Musteri musteri = context.getBean("beanMusteri", Musteri.class);
		musteri.hesabiOde();

	}

}

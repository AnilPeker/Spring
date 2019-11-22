package com.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		Personel personel = context.getBean("beanPersonel", Personel.class);

		System.out.println(personel);

	}

}

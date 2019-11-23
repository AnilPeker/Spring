package com.resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@SuppressWarnings({ "deprecation", "unused" })
public class Cizim {

	public static void main(String[] args) {
		//Resource resource = new FileSystemResource("spring.xml");     // Yak�n yerler ve performans i�in 
		//XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
		
		//ClassPathResource classPathResource = new ClassPathResource("spring.xml");//Uzaktaki yerler i�in 
		//BeanFactory beanFactory =  new XmlBeanFactory(classPathResource);
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring.xml"}); // birden fazla xml den bean �ekilecekse string i virg�l ile �o�altabiliriz.
		BeanFactory beanFactory =  context;
		Ucgen ucgen = (Ucgen) beanFactory.getBean("ucgen");
		ucgen.ciz();
		
	}

}

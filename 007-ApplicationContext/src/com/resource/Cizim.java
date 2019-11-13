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
		
		//ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring.xml"}); // birden fazla xml den bean �ekilecekse string i virg�l ile �o�altabiliriz.
		//BeanFactory beanFactory =  context;															   nesneleri olu�tur ve sadece ba� kur diyosam bunu kullan
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");// context beanfactory nin daha kapsaml�s�
																						// databse transaction AOP gibi i�lemlerde bunu kullan�r�m
		
		Ucgen ucgen = (Ucgen) context.getBean("ucgen");
		ucgen.ciz();
		
		Daire daire = (Daire) context.getBean("daire");
		daire.ciz();
		
	}

}

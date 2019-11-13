package com.resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@SuppressWarnings({ "deprecation", "unused" })
public class Cizim {

	public static void main(String[] args) {
		//Resource resource = new FileSystemResource("spring.xml");     // Yak�n yerler ve performans i�in 
		//XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
		ClassPathResource classPathResource = new ClassPathResource("spring.xml");//Uzaktaki yerler i�in 
		BeanFactory beanFactory =  new XmlBeanFactory(classPathResource);
		Ucgen ucgen = (Ucgen) beanFactory.getBean("ucgen");
		ucgen.ciz();
	}

}

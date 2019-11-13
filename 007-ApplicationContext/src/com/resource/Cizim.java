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
		//Resource resource = new FileSystemResource("spring.xml");     // Yakýn yerler ve performans için 
		//XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
		
		//ClassPathResource classPathResource = new ClassPathResource("spring.xml");//Uzaktaki yerler için 
		//BeanFactory beanFactory =  new XmlBeanFactory(classPathResource);
		
		//ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring.xml"}); // birden fazla xml den bean çekilecekse string i virgül ile çoðaltabiliriz.
		//BeanFactory beanFactory =  context;															   nesneleri oluþtur ve sadece bað kur diyosam bunu kullan
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");// context beanfactory nin daha kapsamlýsý
																						// databse transaction AOP gibi iþlemlerde bunu kullanýrým
		
		Ucgen ucgen = (Ucgen) context.getBean("ucgen");
		ucgen.ciz();
		
		Daire daire = (Daire) context.getBean("daire");
		daire.ciz();
		
	}

}

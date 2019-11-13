package com.first;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Appcalistir {

	public static void main(String[] args) {
		BeanFactory context = new XmlBeanFactory(new FileSystemResource("SpringBeanConf.xml"));
		Araba araba = (Araba) context.getBean("araba");
		araba.hareketeGec();
	}

}

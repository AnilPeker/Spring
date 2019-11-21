package com.resource;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitSelam implements BeanPostProcessor{
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Baþlatmadan sonrasi : " + beanName);
		return bean;
	}
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Baþlatmadan öncesi: " + beanName);
		return bean;
	}
}

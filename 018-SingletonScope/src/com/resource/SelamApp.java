package com.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SuppressWarnings("resource")
public class SelamApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
//		Selam selam = context.getBean("beanSelam",Selam.class);
//		selam.setMesaj("Anil Peker");
//		selam.goster();
//		
//		Selam selam2 = context.getBean("beanSelam",Selam.class); //eger deger vermez isen burdaki de�er ilk nesne ile ayn�d�r
//		selam2.goster();
		
		Selam selam = context.getBean("beanSelam",Selam.class);
		selam.setMesaj("Anil Peker");
		selam.goster();
		
		Selam selam2 = context.getBean("beanSelam",Selam.class); //eger deger vermez isen burdaki de�er ilk nesne ile ayn�d�r
		selam2.setMesaj("Tugce Zaferler");
		selam2.goster();
		
		selam.goster();// Burda en son kullan�lan hangi de�er ise onu g�sterir.
						//Selam 1 nesnesinin value'su an�l olmas�na ra�men son girilen nesne tu��e oldu�u i�in bundansonra selam nesnesi ile ilgili b�t�n de�erler tugce olarak devam eder
		
	
	}

}

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
//		Selam selam2 = context.getBean("beanSelam",Selam.class); //eger deger vermez isen burdaki deðer ilk nesne ile aynýdýr
//		selam2.goster();
		
		Selam selam = context.getBean("beanSelam",Selam.class);
		selam.setMesaj("Anil Peker");
		selam.goster();
		
		Selam selam2 = context.getBean("beanSelam",Selam.class); //eger deger vermez isen burdaki deðer ilk nesne ile aynýdýr
		selam2.setMesaj("Tugce Zaferler");
		selam2.goster();
		
		selam.goster();// Burda en son kullanýlan hangi deðer ise onu gösterir.
						//Selam 1 nesnesinin value'su anýl olmasýna raðmen son girilen nesne tuðçe olduðu için bundansonra selam nesnesi ile ilgili bütün deðerler tugce olarak devam eder
		
	
	}

}

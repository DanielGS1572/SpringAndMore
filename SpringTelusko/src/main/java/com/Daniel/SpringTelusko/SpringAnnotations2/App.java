package com.Daniel.SpringTelusko.SpringAnnotations2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String args[]) {
		
		/*Ver que en AppConfig ya no se necesitan las anotaciones de @Bean pues lo que da solucion a esto
		 * es el @Component de cada clase pues ya esta generando un @Bean*/
		
		/*Si hay dos clases que implementen Processor una de las clases se puede anotar como @primary y ya no mandara error de
		 * conflicto que hay mas de un bean
		 * ó
		 * @Qualifier("sanpDragon")*/
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung s7 = factory.getBean(Samsung.class);
		s7.config();
		
		

	}
}

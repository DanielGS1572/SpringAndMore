package com.Daniel.SpringTelusko.SpringAnnotations1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String args[]) {
		
		
		/*
		 * Como se estará trabajando con anotaciones ya no es necearia la configuración via xml*/
		
//		<beans>
//		<bean id="phone" class="Samsung"/>
//	</beans>
		
		
		
		/*Ahora se esta haciendo con una clase de configuración java, tener cuidado porque el metodo debe estar 
		 * anotado con @Bean (que viene siendo el reemplazo de <bean> dentro del archivo de configuracion de xml*/
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung s7 = factory.getBean(Samsung.class);
		s7.config();
		
		

	}
}

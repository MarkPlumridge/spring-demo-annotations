package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
//		// read spring config file using XML
//		ClassPathXmlApplicationContext context =
//				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// Instead of using XML file use Java Configuration class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfigDemo2_UseBean_ComponentScanRemoved.class);
		
		// Step 1 : get bean from spring container
		// ICoach theCoach = context.getBean("thatSillyCoach", ICoach.class);
		
		// Step 2 : get default bean from spring container 
		//         Note : Links to @Bean in the SportConfig.class !!!!!
		ICoach theCoach = context.getBean("swimCoach", ICoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDaiyWorkout());
		
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
		
	}

}

package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration                                 // No XML Config file required!!
//Note @ComponentScan removed Beans are defined here using @Bean (just like in the XML) instead of directly in the class as @Component 
//@ComponentScan("com.luv2code.springdemo")      // Scan for all @Component in the package
public class SportConfigDemo2_UseBean_ComponentScanRemoved {

	
	// define method to expose bean for our sad fortune service
	//   the method name becomes the bean name
	@Bean
	public IFortuneService sadFortuneService() {
		return new SadFortuneService(); 
	}
	
	
	// define bean for our swim coach AND inject dependancy
	@Bean
	public ICoach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	
}

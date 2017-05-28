package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration                                 // No XML Config file required!!
@ComponentScan("com.luv2code.springdemo")      // Scan for all @Component in the package
public class SportConfig {
	
}

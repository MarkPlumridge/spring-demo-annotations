package com.luv2code.springdemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Add component to Spring can scan and register it
@Component 
@Scope("singleton")
public class HappyFortuneService implements IFortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}

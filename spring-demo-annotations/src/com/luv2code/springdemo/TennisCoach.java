package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Spring will automatically register this bean to the Spring Container

// Step 1 : Explicitly name the bean
// @Component("thatSillyCoach")
// Step 2 : Now Make this a default bean id which will be the same name as the class i.e. tennisCoach
@Component
@Scope("singleton")
//@Scope("prototype")
public class TennisCoach implements ICoach {

	// Step 4 - Field Injection. Resolve dependency.  
	//           We have created 4 implementations of IFortuneService so we have to qualify which one to use.
	@Autowired
	@Qualifier("randomFortuneService")
	private IFortuneService fortuneService;
	
	/* Step 1 : Constructor @autowired Injection 
	// Constructor (Spring is going to scan for an implementation of FortuneService
	@Autowired
	public TennisCoach(IFortuneService theFortuneService) {
		fortuneService = theFortuneService;
	
	*/
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside the default constructor");
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside my doMyStartupStuff()");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside my doMyCleanupStuff()");
	}
	
	
	/**
	// Step 2 @ Setter @Autowired injection
	@Autowired
	public void setFortuneService(IFortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside the setFortuneService() method");
		System.out.println("IMPORTANT NOTE : You don't even have to call this method it will be called automatically");
		fortuneService = theFortuneService;
	}	
	
	*/ 

	
	/**
	// Step 3 @ Any Method @Autowired injection
	//   IMPORTANT NOTE : You don't even have to call this method it will be called automatically
	@Autowired
	public void doSomeCrazyStuff(IFortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside the doSomeCrazyStuff() method");
		System.out.println("IMPORTANT NOTE : You don't even have to call this method it will be called automatically");
		fortuneService = theFortuneService;
	}	
	*/
	
	@Override
	public String getDaiyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

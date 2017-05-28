package com.luv2code.springdemo;

public class SwimCoach implements ICoach {

	private IFortuneService fortuneService;
	
	
	public SwimCoach(IFortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDaiyWorkout() {
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune(); 
	}

}

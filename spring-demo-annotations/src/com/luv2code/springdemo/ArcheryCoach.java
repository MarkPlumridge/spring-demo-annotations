package com.luv2code.springdemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("archeryCoach")
@Scope("singleton")
public class ArcheryCoach implements ICoach {

	@Override
	public String getDaiyWorkout() {
		return "Practice drawing your bow";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}

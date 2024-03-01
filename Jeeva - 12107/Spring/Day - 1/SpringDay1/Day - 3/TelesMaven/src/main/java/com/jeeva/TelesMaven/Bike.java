package com.jeeva.TelesMaven;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	@Override
	public void ride() {
		System.out.println("Iam Riding Bike");
	}

}

package com.learnings.state;

public class RedSignalState implements TrafficLightState{

	@Override
	public void next(TrafficLightContext context) {
		System.out.println("Swithing from RED to Yellow");
		context.setState(new YellowSignalState());
		
	}

	@Override
	public String getColor() {
		return "RED";
	}

}

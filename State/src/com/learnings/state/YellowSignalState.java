package com.learnings.state;

public class YellowSignalState implements TrafficLightState{

	@Override
	public void next(TrafficLightContext context) {
		System.out.println("Swithing from  Yellow to Green");
		context.setState(new GreenSignalState());
	}

	@Override
	public String getColor() {
		return "Yellow";
	}

}

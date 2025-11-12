package com.learnings.state;

public class GreenSignalState implements TrafficLightState{

	@Override
	public void next(TrafficLightContext context) {
		System.out.println("Swithing from Green to Red");
		context.setState(new RedSignalState());
	}

	@Override
	public String getColor() {
		return "Green";
	}

}

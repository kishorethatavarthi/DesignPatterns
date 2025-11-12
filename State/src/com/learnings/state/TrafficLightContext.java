package com.learnings.state;

public class TrafficLightContext {
	private TrafficLightState trafficLightState;
	
	public  TrafficLightContext() {
		this.trafficLightState = new RedSignalState();
	}
	
	public void setState(TrafficLightState trafficLightState) {
		this.trafficLightState = trafficLightState;
	}
	
	public void next() {
		trafficLightState.next(this);
	}
	
	public String getColour() {
		return trafficLightState.getColor();
	}
}

package com.learnings.composite;

public class AirConditioner implements SmartDevice{

	@Override
	public void turnOn() {
		System.out.println("Airconditioner turning on ...");
		
	}

	@Override
	public void turnOff() {
		System.out.println("AirConditioner turning off ...");
		
	}

}

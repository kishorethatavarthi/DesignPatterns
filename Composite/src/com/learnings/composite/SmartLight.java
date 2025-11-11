package com.learnings.composite;

public class SmartLight implements SmartDevice{

	@Override
	public void turnOn() {
		System.out.println("smartlight turning on ...");
	}

	@Override
	public void turnOff() {
		System.out.println("smartlight turning off ...");
		
	}

}

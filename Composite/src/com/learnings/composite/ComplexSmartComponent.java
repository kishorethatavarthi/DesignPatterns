package com.learnings.composite;

import java.util.ArrayList;
import java.util.List;

public class ComplexSmartComponent implements SmartDevice{
	
	private List<SmartDevice> smartDevices = new ArrayList<>();
	
	public void addComponent(SmartDevice device) {
		smartDevices.add(device);
	}
	
	public void removeComponent(SmartDevice device) {
		smartDevices.remove(device);
	}

	@Override
	public void turnOn() {
		for(SmartDevice device : smartDevices) {
			device.turnOn();
		}
		
	}

	@Override
	public void turnOff() {
		for(SmartDevice device : smartDevices) {
			device.turnOff();
		}
		
	}
	
	

}

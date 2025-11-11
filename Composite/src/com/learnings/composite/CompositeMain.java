package com.learnings.composite;

public class CompositeMain {
	public static void main(String[] args) {
		SmartDevice airConditioner = new AirConditioner();
		SmartDevice smartLight = new SmartLight();
		ComplexSmartComponent room1 = new ComplexSmartComponent();
		room1.addComponent(airConditioner);
		room1.addComponent(smartLight);
		
		ComplexSmartComponent room2 = new ComplexSmartComponent();
		room2.addComponent(airConditioner);
		room2.addComponent(smartLight);
		
		// Create a floor and add rooms
		ComplexSmartComponent floor = new ComplexSmartComponent();
	    floor.addComponent(room1);
	    floor.addComponent(room2);
	    
	    ComplexSmartComponent house = new ComplexSmartComponent();
	    house.addComponent(floor);
	    // Control the entire house
	    System.out.println("Turning ON all devices in the house:");
	    house.turnOn();
	    System.out.println("Turning OFF all devices in the house:");
	    house.turnOff();
	    
	    // Control a single floor
	    System.out.println("Turning ON all devices on the first floor:");
	    floor.turnOn();
	    System.out.println("Turning OFF all devices on the first floor:");
	    floor.turnOff();
	    // Control a single room
	    System.out.println("Turning ON all devices in Room 1:");
	    room1.turnOn();
	    System.out.println("Turning OFF all devices in Room 1:");
	    room1.turnOff();
		
		
	}

}

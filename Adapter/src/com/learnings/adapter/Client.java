package com.learnings.adapter;

public class Client {
	
	public static void main(String[] args) {
		AppleCharger appleCharger = new AdapterCharger(new AndroidChargerImpl());
		ChargeIphone iphone = new ChargeIphone(appleCharger);
		iphone.charge();
		
		
	}

}

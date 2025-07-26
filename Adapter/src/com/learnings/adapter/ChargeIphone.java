package com.learnings.adapter;

public class ChargeIphone {
	
	private AppleCharger charger;
	
	public ChargeIphone(AppleCharger charger) {
		this.charger = charger;
		
	}
	
	public void charge() {
		charger.chargeIPhone();
	}

}

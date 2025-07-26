package com.learnings.adapter;

public class AdapterCharger implements AppleCharger {
    private AndroidCharger androidCharger;
    
    public AdapterCharger(AndroidCharger charger) {
    	this.androidCharger = charger;
    }
	
	@Override
	public void chargeIPhone() {
		// TODO Auto-generated method stub
		androidCharger.chargeAndroidPhone();
		System.out.println("Your mobile is chaging with adpater charger");
	}

}

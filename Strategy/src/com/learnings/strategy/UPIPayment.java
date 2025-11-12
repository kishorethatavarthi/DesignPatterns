package com.learnings.strategy;

public class UPIPayment implements PaymentProcess{

	@Override
	public void pay() {
		System.out.println("Going with UPI payment");
		
	}

}

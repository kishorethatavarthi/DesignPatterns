package com.learnings.strategy;

public class StripePayment implements PaymentProcess{

	@Override
	public void pay() {
		System.out.println("Going with stripe payment");
		
	}

}

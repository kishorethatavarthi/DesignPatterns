package com.learnings.strategy;

public class StrategyMain {
	
	public static void main(String[] args) {
		PaymentProcess paymentProcess = new StripePayment();
		PaymentProcessor paymentProcessor = new PaymentProcessor(paymentProcess);
		paymentProcessor.pay();
	}

}

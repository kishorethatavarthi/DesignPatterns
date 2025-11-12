package com.learnings.strategy;

public class PaymentProcessor {
	private PaymentProcess paymentProcess;
	
	public PaymentProcessor(PaymentProcess paymentProcess) {
		this.paymentProcess = paymentProcess;
	}
	
	public void pay() {
		paymentProcess.pay();
	}
	
	public void setPaymentProcess(PaymentProcess paymentProcess) {
		this.paymentProcess = paymentProcess;
	}

}

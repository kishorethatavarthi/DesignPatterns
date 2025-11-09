package com.learnings.facade;

class EmailService {
	public void sendNotification(String message) {
		System.out.println("Sending email notification with " + message);
	}
}

class SMSService{
	public void sendNotification(String message) {
		System.out.println("Sending SMS notification " + message);
	}
}

class PushNotificationService{
	public void sendNotification(String message) {
		System.out.println("Sending Push notification " + message);
	}
}

class NotificationFacade{
	private String message;
	EmailService emailService = new EmailService();
	SMSService smsService = new SMSService();
	PushNotificationService pushNotificationService = new PushNotificationService();
	
	public NotificationFacade(String message) {
		this.message = message;
	}
	public void sendNotification() {
		emailService.sendNotification(message);
		smsService.sendNotification(message);
		pushNotificationService.sendNotification(message);
	}
}

public class Facade {
	public static void main(String[] args) {
		NotificationFacade facade = new NotificationFacade("Order Delivered");
		facade.sendNotification();
	}

}

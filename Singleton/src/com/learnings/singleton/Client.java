package com.learnings.singleton;

public class Client {
	
	public static void main(String[] args) throws InterruptedException {
		Runnable r = ()->{
			Test t = Test.getTest();
			t.show();
		};
		
		Thread t1= new Thread(r);
		Thread t2= new Thread(r);
		Thread t3= new Thread(r);
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		
		
		
	}

}

package com.learnings.proxy;

public class RealInternet implements Internet {

	@Override
	public void connectTo(String domain) {
		System.out.println("connected to "+ domain);

	}

}

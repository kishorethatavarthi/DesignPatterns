package com.learnings.proxy;

public class Client {
	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
		internet.connectTo("google");
		internet.connectTo("abc");
	}
}

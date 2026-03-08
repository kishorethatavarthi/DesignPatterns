package com.learnings.builder;

public class BuilderMain {
	public static void main(String[] args) {
		User user = new User.Builder().name("kishore").phone("12345").age(26).build();
		System.out.println(user);
	}

}

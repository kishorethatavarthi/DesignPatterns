package com.learnings.decorator;

public class Capaccino implements Coffee{

	@Override
	public String description() {
		return "capaccino";
	}

	@Override
	public double cost() {
		return 4.0;
	}

}

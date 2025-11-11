package com.learnings.decorator;

public class Expresso implements Coffee{

	@Override
	public String description() {
		return "Expresso ";
	}

	@Override
	public double cost() {
		return 3.0;
	}

}

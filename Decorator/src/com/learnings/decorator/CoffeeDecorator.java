package com.learnings.decorator;

public abstract class CoffeeDecorator implements Coffee{
	
	protected  Coffee coffee;
	
	public CoffeeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String description() {
		return coffee.description();
	}

	@Override
	public double cost() {
		return coffee.cost();
	}
	
}

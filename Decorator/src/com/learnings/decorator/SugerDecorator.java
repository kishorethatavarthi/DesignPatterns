package com.learnings.decorator;

public class SugerDecorator extends CoffeeDecorator{

	public SugerDecorator(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public String description() {
		return coffee.description()+ " ,Sugar";
	}

	@Override
	public double cost() {
		return coffee.cost() + 1.5;
	}

}

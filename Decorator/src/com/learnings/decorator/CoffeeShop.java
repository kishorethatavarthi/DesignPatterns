package com.learnings.decorator;

public class CoffeeShop {
	public static void main(String[] args) {
		Coffee coffee = new Capaccino();
		coffee = new MilkDecorator(coffee);
		coffee = new SugerDecorator(coffee);
		System.out.println(coffee.description());
		System.out.println(coffee.cost());
	}

}

package com.rgl.decorator;

public class MilkCoffee extends CoffeeDecorator {

    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return this.coffee.getPrice() + 2;
    }
}

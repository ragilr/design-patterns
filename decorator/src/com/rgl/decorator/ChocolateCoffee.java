package com.rgl.decorator;

public class ChocolateCoffee extends CoffeeDecorator{

    public ChocolateCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return this.coffee.getPrice()+5;
    }
}

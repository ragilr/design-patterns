package com.rgl.prototype;

public class Car extends Vehicle{
    private final int topSpeed;

    public Car(String model, String brand, String color, int topSpeed) {
        super(model, brand, color);
        this.topSpeed = topSpeed;
    }

    public Car(Car c) {
        super(c);
        this.topSpeed = c.topSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "topSpeed=" + topSpeed +
                '}'+super.toString();
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
}

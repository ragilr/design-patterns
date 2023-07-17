package com.rgl.prototype;

public abstract class Vehicle {
    private final String model;
    private final String brand;
    private final String color;

    public Vehicle(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    protected Vehicle(Vehicle v) {
        this.model = v.model;
        this.brand = v.brand;
        this.color = v.color;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract Vehicle clone();
}

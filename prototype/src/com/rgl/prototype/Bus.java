package com.rgl.prototype;

public class Bus extends Vehicle {

    private final int doors;

    public Bus(String model, String brand, String color, int doors) {
        super(model, brand, color);
        this.doors = doors;
    }

    public Bus(Bus b) {
        super(b);
        this.doors = b.doors;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "doors=" + doors +
                '}'+super.toString();
    }

    @Override
    public Bus clone() {
        return new Bus(this);
    }
}

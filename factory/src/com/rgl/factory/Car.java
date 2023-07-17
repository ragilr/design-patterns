package com.rgl.factory;

public class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    @Override
    public void v_break() {
        System.out.println("Car is breaking");
    }
}

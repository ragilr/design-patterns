package com.rgl.factory;

public class Bike implements Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Bike is accelerating");
    }

    @Override
    public void v_break() {
        System.out.println("Bike is breaking");
    }

    public void wheelie() {
        System.out.println("Bike is doing a wheelie");
    }
}

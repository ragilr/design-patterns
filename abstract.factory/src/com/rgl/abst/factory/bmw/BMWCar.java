package com.rgl.abst.factory.bmw;

import com.rgl.abst.factory.Vehicle;

public class BMWCar implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("BMW car is accelerating");
    }

    @Override
    public void v_break() {
        System.out.println("BMW car is breaking");
    }
}

package com.rgl.abst.factory.bmw;

import com.rgl.abst.factory.Vehicle;

public class BMWBike implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("BMW bike is accelerating");
    }

    @Override
    public void v_break() {
        System.out.println("BMW bike is breaking");
    }
}

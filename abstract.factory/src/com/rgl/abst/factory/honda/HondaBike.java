package com.rgl.abst.factory.honda;

import com.rgl.abst.factory.Vehicle;

public class HondaBike implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Honda bike is accelerating");
    }

    @Override
    public void v_break() {
        System.out.println("Honda bike is breaking");
    }
}

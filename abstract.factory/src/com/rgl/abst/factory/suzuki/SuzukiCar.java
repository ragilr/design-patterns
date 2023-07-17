package com.rgl.abst.factory.suzuki;

import com.rgl.abst.factory.Vehicle;

public class SuzukiCar implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Suzuki car is accelerating");
    }

    @Override
    public void v_break() {
        System.out.println("Suzuki car is breaking");
    }
}

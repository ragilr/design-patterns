package com.rgl.abst.factory.suzuki;

import com.rgl.abst.factory.Vehicle;

public class SuzukiBike implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Suzuki bike is accelerating");
    }

    @Override
    public void v_break() {
        System.out.println("Suzuki bike is breaking");
    }
}

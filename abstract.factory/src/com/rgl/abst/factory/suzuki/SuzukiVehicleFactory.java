package com.rgl.abst.factory.suzuki;

import com.rgl.abst.factory.Vehicle;
import com.rgl.abst.factory.VehicleFactory;


public class SuzukiVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createCar() {
        return new SuzukiCar();
    }

    @Override
    public Vehicle createBike() {
        return new SuzukiCar();
    }
}

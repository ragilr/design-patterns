package com.rgl.abst.factory.bmw;

import com.rgl.abst.factory.Vehicle;
import com.rgl.abst.factory.VehicleFactory;

public class BMWVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createCar() {
        return new BMWCar();
    }

    @Override
    public Vehicle createBike() {
        return new BMWBike();
    }

}

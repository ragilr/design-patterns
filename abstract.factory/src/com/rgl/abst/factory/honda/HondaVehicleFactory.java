package com.rgl.abst.factory.honda;

import com.rgl.abst.factory.Vehicle;
import com.rgl.abst.factory.VehicleFactory;

public class HondaVehicleFactory implements VehicleFactory {

    @Override
    public Vehicle createCar() {
        return new HondaCar();
    }

    @Override
    public Vehicle createBike() {
        return new HondaBike();
    }
}

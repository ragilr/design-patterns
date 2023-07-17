package com.rgl.abst.factory;

import com.rgl.abst.factory.bmw.BMWVehicleFactory;
import com.rgl.abst.factory.constants.Brand;
import com.rgl.abst.factory.honda.HondaVehicleFactory;
import com.rgl.abst.factory.suzuki.SuzukiVehicleFactory;

public class AbstractVehicleFactory {
    public static VehicleFactory createVehicleFactory(Brand brand) {
        switch (brand) {
            case SUZUKI -> {
                return new SuzukiVehicleFactory();
            }
            case BMW -> {
                return new BMWVehicleFactory();
            }
            case HONDA -> {
                return new HondaVehicleFactory();
            }
            default -> {
                throw new IllegalArgumentException();
            }
        }
    }
}

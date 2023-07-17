package com.rgl.vehicle;
import com.rgl.vehicle.constants.VehicleType;
public class VehicleFactory {
    public static Vehicle getVehicle(VehicleType type) {
        Vehicle vehicle;
        switch (type) {
            case CAR -> {
                vehicle = new Car();
            }
            case BIKE -> {
                vehicle = new Bike();
            }
            default -> {
                throw new IllegalArgumentException();
            }
        }
        return vehicle;
    }
}

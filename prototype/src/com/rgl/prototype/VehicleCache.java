package com.rgl.prototype;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleCache {
    private final Map<String, Vehicle> cache = new HashMap<>();

    public VehicleCache() {
        this.cache.put("Bugatti Chiron", new Car("Bugatti", "Chiron", "Blue", 261));
        this.cache.put("Mercedes Setra", new Bus("Mercedes", "Setra", "White", 48));
    }

    public Vehicle get(String key) {
        return this.cache.get(key);
    }

    public void put(List<Vehicle> vehicles) {
        vehicles.forEach(vehicle -> cache.put(vehicle.getBrand() + " " + vehicle.getModel(), vehicle));
    }
}

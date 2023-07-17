import com.rgl.prototype.Bus;
import com.rgl.prototype.Car;
import com.rgl.prototype.Vehicle;
import com.rgl.prototype.VehicleCache;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car("BMW", "X7", "White", 240));
        vehicleList.add(new Bus("Volvo", "Garuda", "Grey", 2));

        vehicleList.forEach(System.out::println);

        List<Vehicle> copyList = new ArrayList<>();
        for (Vehicle v : vehicleList) {
            copyList.add(v.clone());
        }

        copyList.forEach((System.out::println));

        // Prototype registry
        VehicleCache registry = new VehicleCache();
        registry.put(vehicleList);
        System.out.println(registry.get("X7 BMW"));
    }
}
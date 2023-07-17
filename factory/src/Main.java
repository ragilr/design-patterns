import com.rgl.vehicle.*;
import com.rgl.vehicle.constants.VehicleType;

public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle(VehicleType.CAR);
        car.accelerate();
        car.v_break();

        Vehicle bike = VehicleFactory.getVehicle(VehicleType.BIKE);
        bike.accelerate();
        ((Bike) bike).wheelie();
        bike.v_break();
    }
}
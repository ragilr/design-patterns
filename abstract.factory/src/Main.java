import com.rgl.abst.factory.AbstractVehicleFactory;
import com.rgl.abst.factory.Vehicle;
import com.rgl.abst.factory.VehicleFactory;
import com.rgl.abst.factory.constants.Brand;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = AbstractVehicleFactory.createVehicleFactory(Brand.SUZUKI);
        Vehicle bike = factory.createBike();
        bike.accelerate();
        bike.v_break();
        Vehicle car = factory.createCar();
        car.accelerate();
        car.v_break();
    }
}
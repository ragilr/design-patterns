import com.rgl.facade.DeliveryPartner;
import com.rgl.facade.FoodDeliveryApp;

public class Main {
    public static void main(String[] args) {
        // World
        FoodDeliveryApp zomato = new FoodDeliveryApp();
        zomato.registerAsDeliveryPartner(new DeliveryPartner("Sachin", 4.94));
        zomato.registerAsDeliveryPartner(new DeliveryPartner("Rohit", 4.91));
        zomato.registerAsDeliveryPartner(new DeliveryPartner("Sehwag", 4.5));
        zomato.registerAsDeliveryPartner(new DeliveryPartner("Dravid", 4.19));

        // Another part of the world someone decides to order food
        zomato.orderFood();
    }
}
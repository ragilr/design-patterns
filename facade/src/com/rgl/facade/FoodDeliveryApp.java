package com.rgl.facade;

public class FoodDeliveryApp {
    private final Restaurant restaurant;
    private final DeliveryTeam deliveryTeam;

    public FoodDeliveryApp() {
        this.deliveryTeam = new DeliveryTeam();
        this.restaurant = new Restaurant();
    }

    public void orderFood() {
        this.restaurant.askToPrepareFood();
        DeliveryPartner deliveryPartner = this.deliveryTeam.assignDeliveryPartner();
        System.out.println("Assigned " + deliveryPartner.getName() + " to deliver your food");
        restaurant.askToHandoverFood(deliveryPartner);
        deliveryPartner.deliverFood();
        System.out.println(deliveryPartner.getName()+" has delivered your food. Rating:"+deliveryPartner.getRating());
    }

    public void registerAsDeliveryPartner(DeliveryPartner deliveryPartner){
        this.deliveryTeam.addDeliveryPartners(deliveryPartner);
    }
}

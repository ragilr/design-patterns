package com.rgl.facade;

public class Restaurant {

    private void prepareFood() {
        System.out.println("Preparing food");
    }

    private void handoverFood(DeliveryPartner deliveryPartner) {
        System.out.println("Restaurant : Food prepared");
        System.out.println("Restaurant : Handing over food to " + deliveryPartner.getName());
    }

    public void askToPrepareFood() {
        System.out.println("Accept order");
        prepareFood();
    }

    public void askToHandoverFood(DeliveryPartner deliveryPartner) {
        handoverFood(deliveryPartner);
    }

}

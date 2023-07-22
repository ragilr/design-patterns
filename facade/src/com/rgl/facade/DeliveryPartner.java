package com.rgl.facade;

public class DeliveryPartner {
    private final String name;
    private final double rating;

    public DeliveryPartner(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public void deliverFood() {
        System.out.println("Navigating to your home");
        System.out.println("Delivered food");
    }
}

package com.rgl.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class DeliveryTeam {
    List<DeliveryPartner> deliveryPartners;

    DeliveryTeam() {
        deliveryPartners = new ArrayList<>();
    }

    void addDeliveryPartners(DeliveryPartner dp){
        this.deliveryPartners.add(dp);
    }

    DeliveryPartner assignDeliveryPartner() {
        int randomDp = ThreadLocalRandom.current().nextInt(0, this.deliveryPartners.size());
        return this.deliveryPartners.get(randomDp);
    }
}

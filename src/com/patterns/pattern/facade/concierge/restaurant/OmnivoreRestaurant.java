package com.patterns.pattern.facade.concierge.restaurant;

import static java.lang.System.out;

public class OmnivoreRestaurant {

    public void bookSeat(int persons) {
        out.println("Booked seat in omnivore restaurant for " + persons);
    }

    public void orderFood(int persons) {
        out.println("Ordered omnivore food for " + persons);
    }

}

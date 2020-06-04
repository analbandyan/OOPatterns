package com.patterns.pattern.facade.concierge.restaurant;

import static java.lang.System.out;

public class VegetarianRestaurant {

    public void bookSeat(int persons) {
        out.println("Booked seat in vegetarian restaurant for " + persons);
    }

    public void orderVegetarianFood(int persons) {
        out.println("Ordered vegetarian food for " + persons);
    }

}

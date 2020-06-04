package com.patterns.pattern.facade.concierge.transportation;

public class TaxiService {

    public void orderTaxi(String from, String to) {
        System.out.println("Ordered a taxi service from " + from + " to " + to);
    }

    public void orderDelivery(String from, String to, String deliverySubject) {
        System.out.println("Ordered a delivery service from " + from + " to " + to + " to deliver " + deliverySubject);
    }
}

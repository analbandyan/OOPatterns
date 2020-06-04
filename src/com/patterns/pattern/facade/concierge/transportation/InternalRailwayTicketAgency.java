package com.patterns.pattern.facade.concierge.transportation;

public class InternalRailwayTicketAgency {

    public void bookPhysicalTicketToCity(String city, int count) {
        System.out.println("Booked physical ticket to city " + city + " for " + count);
    }

}

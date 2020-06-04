package com.patterns.pattern.facade.concierge;

import com.patterns.pattern.facade.concierge.restaurant.OmnivoreRestaurant;
import com.patterns.pattern.facade.concierge.restaurant.VegetarianRestaurant;
import com.patterns.pattern.facade.concierge.thatre.MovieTheatre;
import com.patterns.pattern.facade.concierge.thatre.OperaTheatre;
import com.patterns.pattern.facade.concierge.transportation.AirTicketAgency;
import com.patterns.pattern.facade.concierge.transportation.InternalRailwayTicketAgency;
import com.patterns.pattern.facade.concierge.transportation.TaxiService;
import static java.lang.System.out;

import java.util.Random;

public class Concierge {

    private final OmnivoreRestaurant omnivoreRestaurant = new OmnivoreRestaurant();
    private final VegetarianRestaurant vegetarianRestaurant = new VegetarianRestaurant();
    private final MovieTheatre movieTheatre = new MovieTheatre();
    private final OperaTheatre operaTheatre = new OperaTheatre();
    private final AirTicketAgency airTicketAgency = new AirTicketAgency();
    private final InternalRailwayTicketAgency internalRailwayTicketAgency = new InternalRailwayTicketAgency();
    private final TaxiService taxiService = new TaxiService();

    public void organizeRomanticDinner() {
        out.println("\nOrganizing romantic evening");
        bookTheatre(2);
        bookRestaurant(2);
        taxiService.orderTaxi("Meeting point", "Theatre");
        taxiService.orderTaxi("Theatre", "Restaurant");
    }

    private void bookRestaurant(int persons) {
        boolean vegetarianOption = new Random().nextInt() % 2 == 0;
        if (vegetarianOption) {
            vegetarianRestaurant.bookSeat(2);
        } else {
            omnivoreRestaurant.bookSeat(2);
        }
    }

    private void bookTheatre(int persons) {
        boolean classicTheatreOption = new Random().nextInt() % 2 == 0;
        if(classicTheatreOption) {
            operaTheatre.bookSeatPhysicalTicket(2);
            taxiService.orderDelivery("Opera Theatre", "Home", "Opera theatre tickets");
        } else {
            movieTheatre.bookSeatElectronicTicket(2);
        }
    }

    public void orderInternalTrip(String city, int persons) {
        out.println("\nOrganizing internal trip");
        internalRailwayTicketAgency.bookPhysicalTicketToCity(city, persons);
        taxiService.orderDelivery("Railway agency", "Home", "Railway tickets");
        taxiService.orderTaxi("Home", "Railway station");
    }

    public void orderExternalTrip(String country, int persons) {
        out.println("\nOrganizing external trip");
        airTicketAgency.bookElectronicTicketToCountry(country, persons);
        taxiService.orderTaxi("Home", "Airport");
    }

    public void orderFood(boolean vegetarian, String to, int persons) {
        out.println("Ordering foor type = " + (vegetarian ? "vegetarian" : "omnivore"));
        if(vegetarian) {
            vegetarianRestaurant.orderVegetarianFood(persons);
        } else {
            omnivoreRestaurant.orderFood(persons);
        }
        taxiService.orderDelivery("Restaurant", "Home", "Food");
    }

}

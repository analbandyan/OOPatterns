package com.patterns.pattern.facade;

import com.patterns.pattern.facade.concierge.Concierge;
import com.patterns.pattern.facade.smarthome.SmartHome;
import com.patterns.run.PatternRunner;

import static java.lang.System.out;

public class FacadeRunner implements PatternRunner {
    @Override
    public void run() {
//        demoSmartHomeSystem();
        demoConcierge();
    }

    void demoSmartHomeSystem() {
        SmartHome smartHome = new SmartHome();

        out.println("Client woke up, is going to workout now.");
        smartHome.switchToWorkoutMode();
        out.println();

        out.println("Client left home for a work and will come back in the evening.");
        smartHome.switchToMaintenanceMode();
        out.println();

        out.println("Client came back home with friends, and now they are going to have a fantastic party at home.");
        smartHome.switchToPartyMode();
        out.println();

        out.println("Party is finished, Client is totally drunk, he is going to sleep like a bear till the morning.");
        smartHome.switchToRestMode();
        out.println();

        out.println("Client's vacation started, he is leaving the home for 2 weeks.");
        smartHome.switchOff();
        out.println();
    }

    void demoConcierge() {
        Concierge concierge = new Concierge();

        concierge.organizeRomanticDinner();

        concierge.orderInternalTrip("Stepanavan", 3);

        concierge.orderExternalTrip("USA", 5);

        concierge.orderFood(false, "Home", 6);
    }
}

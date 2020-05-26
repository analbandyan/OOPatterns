package com.patterns.pattern.facade;

import com.patterns.run.PatternRunner;

import static java.lang.System.out;

public class FacadeRunner implements PatternRunner {
    @Override
    public void run() {
        demoSmartHomeSystem();
    }

    void demoSmartHomeSystem() {
        out.println("Client woke up, is going to workout now.");
        //turn smart home system to workout mode

        out.println("Client left home for a work and will come back in the evening.");
        //turn on maintenance mode

        out.println("Client came back home with friends, and now they are going to have a fantastic party at home.");
        //turn on party mode

        out.println("Party is finished, Client is totally drunk, he is going to sleep like a bear till the morning.");
        //turn on rest mode


        out.println("Client's vacation started, he is leaving the home for 2 weeks.");
        //turn on vacation mode (i.e. turn off)
    }
}

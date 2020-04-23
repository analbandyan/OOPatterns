package com.patterns.pattern.strategy.impl.behaviors.rest;

import static java.lang.System.out;

public class RestSleep implements RestBehavior {
    @Override
    public void rest() {
        out.println("sleeping");
    }
}
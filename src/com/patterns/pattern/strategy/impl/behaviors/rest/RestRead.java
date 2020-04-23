package com.patterns.pattern.strategy.impl.behaviors.rest;

import static java.lang.System.out;

public class RestRead implements RestBehavior {
    @Override
    public void rest() {
        out.println("reading");
    }
}

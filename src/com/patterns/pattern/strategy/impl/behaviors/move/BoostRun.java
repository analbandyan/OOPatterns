package com.patterns.pattern.strategy.impl.behaviors.move;

import static java.lang.System.out;

public class BoostRun implements MoveBehavior {
    @Override
    public void move() {
        out.println("running very fast");
    }
}

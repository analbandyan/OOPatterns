package com.patterns.pattern.strategy.impl.behaviors.move;

import static java.lang.System.out;

public class Walk implements MoveBehavior {
    @Override
    public void move() {
        out.println("walking");
    }
}

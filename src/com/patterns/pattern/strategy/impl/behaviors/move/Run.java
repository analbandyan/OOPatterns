package com.patterns.pattern.strategy.impl.behaviors.move;

import static java.lang.System.out;

public class Run implements MoveBehavior {
    @Override
    public void move() {
        out.println("running");
    }
}

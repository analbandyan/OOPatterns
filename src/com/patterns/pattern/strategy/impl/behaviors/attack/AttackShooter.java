package com.patterns.pattern.strategy.impl.behaviors.attack;

import static java.lang.System.out;

public class AttackShooter implements AttackBehavior {
    @Override
    public void attack() {
        out.println("shooting");
    }
}

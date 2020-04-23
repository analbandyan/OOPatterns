package com.patterns.pattern.strategy.impl;

import com.patterns.pattern.strategy.impl.behaviors.attack.AttackBehavior;
import com.patterns.pattern.strategy.impl.behaviors.move.MoveBehavior;
import com.patterns.pattern.strategy.impl.behaviors.rest.RestBehavior;

import static java.lang.System.out;

public class Soldier {

    private RestBehavior restBehavior;
    private AttackBehavior attackBehavior;
    private MoveBehavior moveBehavior;

    public Soldier(RestBehavior restBehavior, AttackBehavior attackBehavior, MoveBehavior moveBehavior) {
        this.restBehavior = restBehavior;
        this.attackBehavior = attackBehavior;
        this.moveBehavior = moveBehavior;
    }

    //members and stable behaviors
    public void breath() {
        out.println("breathing");
    }

    public void speak() {
        out.println("speaking");
    }

    public void eat() {
        out.println("eating");
    }

    //varying behaviors
    public void move() {
        moveBehavior.move();
    }

    public void attack() {
        attackBehavior.attack();
    }

    public void rest() {
        restBehavior.rest();
    }

    public RestBehavior getRestBehavior() {
        return restBehavior;
    }

    public void setRestBehavior(RestBehavior restBehavior) {
        this.restBehavior = restBehavior;
    }

    public AttackBehavior getAttackBehavior() {
        return attackBehavior;
    }

    public void setAttackBehavior(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }

    public MoveBehavior getMoveBehavior() {
        return moveBehavior;
    }

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }
}

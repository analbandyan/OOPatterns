package com.patterns.pattern.strategy;

import com.patterns.pattern.strategy.impl.*;
import com.patterns.pattern.strategy.impl.behaviors.attack.AttackBoxer;
import com.patterns.pattern.strategy.impl.behaviors.attack.AttackShooter;
import com.patterns.pattern.strategy.impl.behaviors.move.BoostRun;
import com.patterns.pattern.strategy.impl.behaviors.move.Run;
import com.patterns.pattern.strategy.impl.behaviors.move.Walk;
import com.patterns.pattern.strategy.impl.behaviors.rest.RestParty;
import com.patterns.pattern.strategy.impl.behaviors.rest.RestRead;
import com.patterns.pattern.strategy.impl.behaviors.rest.RestSleep;
import com.patterns.run.PatternRunner;

import java.util.List;

import static java.lang.System.out;
import static java.lang.String.format;

public class StrategyRunner implements PatternRunner {

    public void run() {

        //we can create soldiers with different characteristics, and the behaviors can be used
        //in other "clients", like Student can use Read and Sleep behaviors,
        //or Sportsman can use Run and BoostRun behaviors, etc...
        out.println("several soldiers with different behaviors");
        List.of(
                new Soldier(new RestParty(), new AttackBoxer(), new Run()),
                new Soldier(new RestParty(), new AttackBoxer(), new Walk()),
                new Soldier(new RestParty(), new AttackShooter(), new Walk()),
                new Soldier(new RestParty(), new AttackShooter(), new Run()),
                new Soldier(new RestSleep(), new AttackBoxer(), new Walk()),
                new Soldier(new RestRead(), new AttackBoxer(), new BoostRun())
        ).forEach(StrategyRunner::act);
        out.println();

        //we can change ANY behavior independently from other behaviors, and do it runtime
        out.println("Changing particular soldier's behaviors runtime");
        Soldier soldier = new Soldier(new RestSleep(), new AttackBoxer(), new Run());
        act(soldier);
        soldier.setRestBehavior(new RestParty());
        act(soldier);
        soldier.setMoveBehavior(new BoostRun());
        soldier.setAttackBehavior(new AttackShooter());
        act(soldier);
        out.println();

    }

    private static void act(Soldier soldier) {
        out.println(format("Hi, I am a soldier %d, and I have the following behaviors:", soldier.hashCode()));
        soldier.move();
        soldier.attack();
        soldier.rest();
        out.println();
    }

}

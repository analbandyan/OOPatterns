package com.patterns.run;

import com.patterns.pattern.singleton.SingletonRunner;
import com.patterns.pattern.strategy.StrategyRunner;

public class PatternRunnerFactory {

    public static PatternRunner createPatternRunner(Pattern pattern) {
        switch (pattern) {
            case SINGLETON:
                return new SingletonRunner();
            case STRATEGY:
                return new StrategyRunner();
            default:
                throw new RuntimeException("Unknown pattern " + pattern);
        }
    }

}

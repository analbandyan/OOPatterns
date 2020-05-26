package com.patterns.run;

import com.patterns.pattern.adapter.AdapterRunner;
import com.patterns.pattern.bridge.BridgeRunner;
import com.patterns.pattern.facade.FacadeRunner;
import com.patterns.pattern.singleton.SingletonRunner;
import com.patterns.pattern.strategy.StrategyRunner;

public class PatternRunnerFactory {

    public static PatternRunner createPatternRunner(Pattern pattern) {
        switch (pattern) {
            case SINGLETON:
                return new SingletonRunner();
            case STRATEGY:
                return new StrategyRunner();
            case ADAPTER:
                return new AdapterRunner();
            case BRIDGE:
                return new BridgeRunner();
            case FACADE:
                return new FacadeRunner();
            default:
                throw new RuntimeException("Unknown pattern " + pattern);
        }
    }

}

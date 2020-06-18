package com.patterns.run;

import com.patterns.pattern.adapter.AdapterRunner;
import com.patterns.pattern.bridge.BridgeRunner;
import com.patterns.pattern.decorator.DecoratorRunner;
import com.patterns.pattern.facade.FacadeRunner;
import com.patterns.pattern.singleton.SingletonRunner;
import com.patterns.pattern.strategy.StrategyRunner;
import com.patterns.pattern.templatemethod.TemlpateMethodRunner;

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
            case DECORATOR:
                return new DecoratorRunner();
            case TEMPLATE_METHOD:
                return new TemlpateMethodRunner();
            default:
                throw new RuntimeException("Unknown pattern " + pattern);
        }
    }

}

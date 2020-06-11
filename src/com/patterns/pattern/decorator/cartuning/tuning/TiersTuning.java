package com.patterns.pattern.decorator.cartuning.tuning;

import com.patterns.pattern.decorator.cartuning.car.Car;

public class TiersTuning extends TuningServiceDecorator {

    private final TierType tierType;

    public TiersTuning(TuningService tuningService, TierType tierType) {
        super(tuningService);
        this.tierType = tierType;
    }

    @Override
    public void tune(Car car) {
        super.tune(car);
        System.out.println(car + ": tiers " + tierType);
    }

    @Override
    public float getPrice() {
        return super.getPrice() + tierType.price;
    }

    public enum TierType {
        LOW_PROFILE(280),
        SPORT(350),
        USUAL(160),
        OUTROAD(500);

        private final float price;

        TierType(float price) {
            this.price = price;
        }
    }
}

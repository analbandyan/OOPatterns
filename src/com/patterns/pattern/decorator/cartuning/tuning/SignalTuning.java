package com.patterns.pattern.decorator.cartuning.tuning;

import com.patterns.pattern.decorator.cartuning.car.Car;

public class SignalTuning extends TuningServiceDecorator {

    private final SignalType signalType;

    public SignalTuning(TuningService tuningService, SignalType signalType) {
        super(tuningService);
        this.signalType = signalType;
    }

    @Override
    public void tune(Car car) {
        super.tune(car);
        System.out.println(car + ": signals " + signalType);
    }

    @Override
    public float getPrice() {
        return super.getPrice() + signalType.price;
    }

    public enum SignalType {
        BOSCH(300),
        ORIGINAL_FIX(50);

        private final float price;

        SignalType(float price) {
            this.price = price;
        }
    }

}

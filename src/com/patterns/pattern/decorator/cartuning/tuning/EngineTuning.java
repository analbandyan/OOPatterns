package com.patterns.pattern.decorator.cartuning.tuning;

import com.patterns.pattern.decorator.cartuning.car.Car;

public class EngineTuning extends TuningServiceDecorator {

    public EngineTuning(TuningService tuningService) {
        super(tuningService);
    }

    @Override
    public void tune(Car car) {
        super.tune(car);
        System.out.println(car + ": Engine tuning");
    }

    @Override
    public float getPrice() {
        return super.getPrice() + 1500;
    }
}

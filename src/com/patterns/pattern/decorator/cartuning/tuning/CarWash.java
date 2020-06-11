package com.patterns.pattern.decorator.cartuning.tuning;

import com.patterns.pattern.decorator.cartuning.car.Car;

public class CarWash implements TuningService {

    @Override
    public void tune(Car car) {
        System.out.println(car + ": Minimal Service - full car wash");
    }

    @Override
    public float getPrice() {
        return 20;
    }
}

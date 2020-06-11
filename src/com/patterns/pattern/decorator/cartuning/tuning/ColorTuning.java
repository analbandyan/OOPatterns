package com.patterns.pattern.decorator.cartuning.tuning;

import com.patterns.pattern.decorator.cartuning.car.Car;

public class ColorTuning extends TuningServiceDecorator {

    private final Color color;

    public ColorTuning(TuningService tuningService, Color color) {
        super(tuningService);
        this.color = color;
    }

    @Override
    public void tune(Car car) {
        super.tune(car);
        System.out.println(car + ": color " + color);
    }

    @Override
    public float getPrice() {
        return super.getPrice() + 220;
    }

    public enum Color {
        BLACK,
        WHITE,
        BLUE,
        METAL,
        READ;
    }
}

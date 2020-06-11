package com.patterns.pattern.decorator.cartuning.tuning;

import com.patterns.pattern.decorator.cartuning.car.Car;

public class TuningServiceDecorator implements TuningService {

    private TuningService tuningService;

    public TuningServiceDecorator(TuningService tuningService) {
        this.tuningService = tuningService;
    }

    @Override
    public void tune(Car car) {
        tuningService.tune(car);
    }

    @Override
    public float getPrice() {
        return tuningService.getPrice();
    }
}

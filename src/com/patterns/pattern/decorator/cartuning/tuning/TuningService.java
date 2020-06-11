package com.patterns.pattern.decorator.cartuning.tuning;

import com.patterns.pattern.decorator.cartuning.car.Car;

public interface TuningService {

    void tune(Car car);

    float getPrice();

}

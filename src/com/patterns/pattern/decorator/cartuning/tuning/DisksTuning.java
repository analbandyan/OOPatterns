package com.patterns.pattern.decorator.cartuning.tuning;

import com.patterns.pattern.decorator.cartuning.car.Car;

public class DisksTuning extends TuningServiceDecorator {

    private final DiskType diskType;

    public DisksTuning(TuningService tuningService, DiskType diskType){
        super(tuningService);
        this.diskType = diskType;
    }

    @Override
    public void tune(Car car) {
        super.tune(car);
        System.out.println(car + ": disk " + diskType);
    }

    @Override
    public float getPrice() {
        return super.getPrice() + diskType.price;
    }

    public enum DiskType {
        ALUMINUM(300),
        SPORT(500),
        USUAL(90),
        LOW_PROFILE(400);

        private final float price;

        DiskType(float price) {
            this.price = price;
        }
    }

}

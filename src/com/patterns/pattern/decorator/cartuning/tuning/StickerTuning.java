package com.patterns.pattern.decorator.cartuning.tuning;

import com.patterns.pattern.decorator.cartuning.car.Car;

public class StickerTuning extends TuningServiceDecorator {

    private final Sticker sticker;

    public StickerTuning(TuningService tuningService, Sticker sticker) {
        super(tuningService);
        this.sticker = sticker;
    }

    @Override
    public void tune(Car car) {
        super.tune(car);
        System.out.println(car + ": sticker  " + sticker);
    }

    @Override
    public float getPrice() {
        return super.getPrice() + 220;
    }

    public enum Sticker {
        NATURE,
        LION,
        DINOSAUR,
        BOOL_DOG,
        DEVIL;
    }

}

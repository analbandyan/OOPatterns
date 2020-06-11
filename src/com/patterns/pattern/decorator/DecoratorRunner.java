package com.patterns.pattern.decorator;

import com.patterns.pattern.decorator.cartuning.car.Car;
import com.patterns.pattern.decorator.cartuning.car.CarDefault;
import com.patterns.pattern.decorator.cartuning.tuning.*;
import com.patterns.pattern.decorator.foodmarket.decorator.OnionToppingDecorator;
import com.patterns.pattern.decorator.foodmarket.decorator.SaltToppingDecorator;
import com.patterns.pattern.decorator.foodmarket.decorator.SauceToppingDecorator;
import com.patterns.pattern.decorator.foodmarket.decorator.TakeAwayWrapperDecorator;
import com.patterns.pattern.decorator.foodmarket.food.ChickenBurger;
import com.patterns.pattern.decorator.foodmarket.food.Food;
import com.patterns.pattern.decorator.foodmarket.food.HammSandwich;
import com.patterns.run.PatternRunner;
import static java.lang.System.out;

public class DecoratorRunner implements PatternRunner {

    @Override
    public void run() {
//        demoCarTuning();
        demoFoodToppings();
    }

    private static void demoCarTuning() {
        Car car = new CarDefault("AA123456789", "BMW M545", 2012);
        TuningService sportTuningPackage = createSportTuningPackage();
        sportTuningPackage.tune(car);
        out.println("Price for Sport Tuning Package = " + sportTuningPackage.getPrice() + "\n");

        TuningService outroadTuningPackage = createOutroadTuningPackage();
        outroadTuningPackage.tune(car);
        out.println("Price for Outroad Tuning Package = " + outroadTuningPackage.getPrice() + "\n");

        TuningService cityTuningPackage = createCityTuningPackage();
        cityTuningPackage.tune(car);
        out.println("Price for City Tuning Package = " + cityTuningPackage.getPrice() + "\n");

        TuningService customTuningPackage = new CarWash();
        customTuningPackage = new ColorTuning(customTuningPackage, ColorTuning.Color.READ);
        customTuningPackage = new DisksTuning(customTuningPackage, DisksTuning.DiskType.LOW_PROFILE);
        customTuningPackage = new SignalTuning(customTuningPackage, SignalTuning.SignalType.BOSCH);
        customTuningPackage = new StickerTuning(customTuningPackage, StickerTuning.Sticker.DEVIL);
        customTuningPackage = new TiersTuning(customTuningPackage, TiersTuning.TierType.LOW_PROFILE);
        customTuningPackage.tune(car);
        out.println("Price for Custom Tuning Package = " + customTuningPackage.getPrice() + "\n");
    }

    private static TuningService createSportTuningPackage() {
        TuningService tuningPackage = new CarWash();
        tuningPackage = new ColorTuning(tuningPackage, ColorTuning.Color.METAL);
        tuningPackage = new DisksTuning(tuningPackage, DisksTuning.DiskType.ALUMINUM);
        tuningPackage = new EngineTuning(tuningPackage);
        tuningPackage = new SignalTuning(tuningPackage, SignalTuning.SignalType.BOSCH);
        tuningPackage = new StickerTuning(tuningPackage, StickerTuning.Sticker.BOOL_DOG);
        tuningPackage = new TiersTuning(tuningPackage, TiersTuning.TierType.LOW_PROFILE);
        return tuningPackage;
    }

    private static TuningService createOutroadTuningPackage() {
        TuningService tuningPackage = new CarWash();
        tuningPackage = new DisksTuning(tuningPackage, DisksTuning.DiskType.USUAL);
        tuningPackage = new EngineTuning(tuningPackage);
        tuningPackage = new SignalTuning(tuningPackage, SignalTuning.SignalType.ORIGINAL_FIX);
        tuningPackage = new StickerTuning(tuningPackage, StickerTuning.Sticker.NATURE);
        tuningPackage = new TiersTuning(tuningPackage, TiersTuning.TierType.OUTROAD);
        return tuningPackage;
    }

    private static TuningService createCityTuningPackage() {
        TuningService tuningPackage = new CarWash();
        tuningPackage = new DisksTuning(tuningPackage, DisksTuning.DiskType.USUAL);
        tuningPackage = new SignalTuning(tuningPackage, SignalTuning.SignalType.ORIGINAL_FIX);
        tuningPackage = new StickerTuning(tuningPackage, StickerTuning.Sticker.LION);
        tuningPackage = new TiersTuning(tuningPackage, TiersTuning.TierType.USUAL);
        return tuningPackage;
    }

    private static void demoFoodToppings() {
        Food food1 = createFood1();
        food1.printName();
        out.println("The price is $" + food1.getPrice());

        out.println();

        Food food2 = createFood2();
        food2.printName();
        out.println("The price is $" + food2.getPrice());
    }


    private static Food createFood1() {
        Food food = new ChickenBurger();

        food = new SaltToppingDecorator(food);
        food = new SauceToppingDecorator(food);

        return food;
    }

    private static Food createFood2() {
        Food food = new HammSandwich();

        food = new SaltToppingDecorator(food);
        food = new SaltToppingDecorator(food);
        food = new SaltToppingDecorator(food);
        food = new OnionToppingDecorator(food);
        food = new SauceToppingDecorator(food);
        food = new TakeAwayWrapperDecorator(food);

        return food;
    }
}

package com.patterns.pattern.decorator.foodmarket.food;

public class ChickenBurger implements Food {
    @Override
    public void printName() {
        System.out.println("Chicken Burger");
    }

    @Override
    public float getPrice() {
        return 8;
    }
}

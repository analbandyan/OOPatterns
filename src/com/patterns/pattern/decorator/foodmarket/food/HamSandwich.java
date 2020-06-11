package com.patterns.pattern.decorator.foodmarket.food;

public class HamSandwich implements Food {
    @Override
    public void printName() {
        System.out.println("Hamm Sandwich");
    }

    @Override
    public float getPrice() {
        return 10;
    }
}

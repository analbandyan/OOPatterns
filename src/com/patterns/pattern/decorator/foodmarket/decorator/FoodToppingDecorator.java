package com.patterns.pattern.decorator.foodmarket.decorator;

import com.patterns.pattern.decorator.foodmarket.food.Food;

public class FoodToppingDecorator implements Food {

    private Food food;

    public FoodToppingDecorator(Food food) {
        this.food = food;
    }

    @Override
    public void printName() {
        food.printName();
    }

    @Override
    public float getPrice() {
        return food.getPrice();
    }
}

package com.patterns.pattern.decorator.foodmarket.decorator;

import com.patterns.pattern.decorator.foodmarket.food.Food;

public class SauceToppingDecorator extends FoodToppingDecorator {

    public SauceToppingDecorator(Food food) {
        super(food);
    }

    @Override
    public void printName() {
        super.printName();
        System.out.println("plus souce");
    }

    @Override
    public float getPrice() {
        return super.getPrice() + 0.5f;
    }
}

package com.patterns.pattern.decorator.foodmarket.decorator;

import com.patterns.pattern.decorator.foodmarket.food.Food;

public class TakeAwayWrapperDecorator extends FoodToppingDecorator {

    public TakeAwayWrapperDecorator(Food food) {
        super(food);
    }

    @Override
    public void printName() {
        super.printName();
        System.out.println("+ wrap to take away");
    }

    @Override
    public float getPrice() {
        return super.getPrice() + 0.1f;
    }
}

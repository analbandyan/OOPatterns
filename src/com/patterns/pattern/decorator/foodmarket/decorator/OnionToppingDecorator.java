package com.patterns.pattern.decorator.foodmarket.decorator;

import com.patterns.pattern.decorator.foodmarket.food.Food;

public class OnionToppingDecorator extends FoodToppingDecorator {

    public OnionToppingDecorator(Food food) {
        super(food);
    }

    @Override
    public void printName() {
        super.printName();
        System.out.println("plus onion");
    }

    @Override
    public float getPrice() {
        return super.getPrice() + 0.3f;
    }

}

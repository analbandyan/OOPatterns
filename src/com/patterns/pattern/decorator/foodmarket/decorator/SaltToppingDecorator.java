package com.patterns.pattern.decorator.foodmarket.decorator;

import com.patterns.pattern.decorator.foodmarket.food.Food;

public class SaltToppingDecorator extends FoodToppingDecorator {

    public SaltToppingDecorator(Food food) {
        super(food);
    }

    @Override
    public void printName() {
        super.printName();
        System.out.println("plus salt");
    }

    @Override
    public float getPrice() {
        return super.getPrice() + 0.2f;
    }
}

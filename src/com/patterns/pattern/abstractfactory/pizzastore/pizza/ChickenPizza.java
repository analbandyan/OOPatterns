package com.patterns.pattern.abstractfactory.pizzastore.pizza;

import com.patterns.pattern.abstractfactory.pizzastore.ingredient.factory.PizzaIngredientFactory;

public class ChickenPizza extends Pizza {

    public ChickenPizza(PizzaIngredientFactory pizzaIngredientsFactory) {
        super("Chicken", pizzaIngredientsFactory);
    }

    @Override
    protected String getSpecificIngredient() {
        return "CHICKEN";
    }
}

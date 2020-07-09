package com.patterns.pattern.abstractfactory.pizzastore.pizza;

import com.patterns.pattern.abstractfactory.pizzastore.ingredient.factory.PizzaIngredientFactory;

public class HamPizza extends Pizza {
    public HamPizza(PizzaIngredientFactory pizzaIngredientsFactory) {
        super("Ham", pizzaIngredientsFactory);
    }

    @Override
    protected String getSpecificIngredient() {
        return "HAM";
    }
}

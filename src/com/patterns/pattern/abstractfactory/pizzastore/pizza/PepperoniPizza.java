package com.patterns.pattern.abstractfactory.pizzastore.pizza;

import com.patterns.pattern.abstractfactory.pizzastore.ingredient.factory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientsFactory) {
        super("Pepperoni", pizzaIngredientsFactory);
    }

    @Override
    protected String getSpecificIngredient() {
        return "PEPERONI";
    }

}

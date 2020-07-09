package com.patterns.pattern.abstractfactory.pizzastore.pizza;

import com.patterns.pattern.abstractfactory.pizzastore.ingredient.factory.PizzaIngredientFactory;

import static java.lang.System.out;

public abstract class Pizza {

    protected String name;
    protected PizzaIngredientFactory pizzaIngredientsFactory;

    public Pizza(String name, PizzaIngredientFactory pizzaIngredientsFactory) {
        this.name = name;
        this.pizzaIngredientsFactory = pizzaIngredientsFactory;
    }

    public void make() {
        out.println("Prepare " + name + " pizza with " + pizzaIngredientsFactory.getIngredientsFamilyName() + " ingredients.");
        out.println("Prepare " + pizzaIngredientsFactory.createDough().getName());
        out.println("Put main specific ingredient: " + getSpecificIngredient());
        out.println("Put " + pizzaIngredientsFactory.createCheese().getName());
        out.println("Put " + pizzaIngredientsFactory.createClam().getName());
        out.println("Put " + pizzaIngredientsFactory.createSauce().getName());
        out.println("Bake");
    }

    protected abstract String getSpecificIngredient();

}

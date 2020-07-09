package com.patterns.pattern.abstractfactory.pizzastore.ingredient.factory;

public class PizzaIngredientsFactoryCreator {

    public static PizzaIngredientFactory createPizzaIngredientsFactory(PizzaIngredientsType pizzaIngredientsType) {
        switch (pizzaIngredientsType) {
            case USA:
                return new UsaPizzaIngredientsFactory();
            case ARMENIAN:
                return new ArmenianPizzaIngredientsFactory();
            default:
                throw new RuntimeException("Unhandled pizza ingredients type: " + pizzaIngredientsType);
        }
    }

}

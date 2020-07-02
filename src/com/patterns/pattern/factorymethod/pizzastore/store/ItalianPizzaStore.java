package com.patterns.pattern.factorymethod.pizzastore.store;

import com.patterns.pattern.factorymethod.pizzastore.pizza.Pizza;
import com.patterns.pattern.factorymethod.pizzastore.pizza.italian.ItalianCheesePizza;
import com.patterns.pattern.factorymethod.pizzastore.pizza.italian.ItalianPepperoniPizza;
import com.patterns.pattern.factorymethod.pizzastore.pizza.italian.ItalianVeganPizza;

public class ItalianPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;

        switch (type) {
            case "cheese":
                pizza = new ItalianCheesePizza();
                break;
            case "pepperoni":
                pizza = new ItalianPepperoniPizza();
                break;
            case "vegan":
                pizza = new ItalianVeganPizza();
                break;
            default:
                throw new RuntimeException("Unknown pizza type: " + type);
        }

        return pizza;
    }

}

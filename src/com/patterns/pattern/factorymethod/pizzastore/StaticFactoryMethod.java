package com.patterns.pattern.factorymethod.pizzastore;

import com.patterns.pattern.factorymethod.pizzastore.pizza.Pizza;
import com.patterns.pattern.factorymethod.pizzastore.pizza.us.USCheesePizza;
import com.patterns.pattern.factorymethod.pizzastore.pizza.us.USPepperoniPizza;
import com.patterns.pattern.factorymethod.pizzastore.pizza.us.USVeganPizza;

//simple factory method idiom
public class StaticFactoryMethod {

    public static Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new USCheesePizza();
                break;
            case "pepperoni":
                pizza = new USPepperoniPizza();
                break;
            case "vegan":
                pizza = new USVeganPizza();
                break;
            default:
                throw new RuntimeException("Unknown pizza type: " + type);
        }
        return pizza;
    }

}

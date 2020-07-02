package com.patterns.pattern.factorymethod.pizzastore.store;

import com.patterns.pattern.factorymethod.pizzastore.pizza.Pizza;

import static java.lang.System.out;

//factory method design pattern
abstract public class PizzaStore {

    public Pizza orderPizza(String type) {
        out.println("Order " + type + " pizza");
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract protected Pizza createPizza(String type);

}

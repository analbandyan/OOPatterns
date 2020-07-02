package com.patterns.pattern.factorymethod.pizzastore.pizza;

import static java.lang.System.out;

abstract public class Pizza {

    private String name;

    public Pizza(String name) {
        this.name = name;
    }

    public void prepare() {
        out.println("prepare " + name + " ...");
    }

    public void bake() {
        out.println("bake " + name + " ...");
    }

    public void cut() {
        out.println("cut " + name + " ...");
    }

    public void box() {
        out.println("box " + name + " ...");
    }

    public String getName() {
        return name;
    }

}

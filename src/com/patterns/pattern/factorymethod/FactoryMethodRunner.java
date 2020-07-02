package com.patterns.pattern.factorymethod;

import com.patterns.pattern.factorymethod.cargo.service.AgriculturalCargoWareService;
import com.patterns.pattern.factorymethod.cargo.service.CargoPackaging;
import com.patterns.pattern.factorymethod.cargo.service.CargoWareService;
import com.patterns.pattern.factorymethod.pizzastore.pizza.Pizza;
import com.patterns.pattern.factorymethod.pizzastore.store.ItalianPizzaStore;
import com.patterns.pattern.factorymethod.pizzastore.store.PizzaStore;
import com.patterns.pattern.factorymethod.pizzastore.store.USPizzaStore;
import com.patterns.run.PatternRunner;

import static java.lang.System.out;

public class FactoryMethodRunner implements PatternRunner {

    @Override
    public void run() {
//        demoCargoWareService();
        demoPizzaStore();
    }

    private static void demoCargoWareService() {
        CargoWareService cargoWareService1 = new AgriculturalCargoWareService();
        cargoWareService1.processCargo(CargoPackaging.PACKED);
        out.println();
        cargoWareService1.processCargo(CargoPackaging.RAW);
        out.println();

        CargoWareService cargoWareService2 = new AgriculturalCargoWareService();
        cargoWareService2.processCargo(CargoPackaging.PACKED);
        out.println();
        cargoWareService2.processCargo(CargoPackaging.RAW);
        out.println();
    }

    private static void demoPizzaStore() {
        PizzaStore pizzaStore1 = new USPizzaStore();
        Pizza pizza = pizzaStore1.orderPizza("cheese");
        out.println("---\n" + pizza.getName() + " is ready.");
        out.println();
        pizza = pizzaStore1.orderPizza("pepperoni");
        out.println("---\n" + pizza.getName() + " is ready.");
        out.println();

        PizzaStore pizzaStore2 = new ItalianPizzaStore();
        pizza = pizzaStore2.orderPizza("cheese");
        out.println("---\n" + pizza.getName() + " is ready.");
        out.println();
        pizza = pizzaStore2.orderPizza("vegan");
        out.println("---\n" + pizza.getName() + " is ready.");

    }

}

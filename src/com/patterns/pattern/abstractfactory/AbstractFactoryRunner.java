package com.patterns.pattern.abstractfactory;

import com.patterns.pattern.abstractfactory.pizzastore.ingredient.factory.PizzaIngredientFactory;
import com.patterns.pattern.abstractfactory.pizzastore.ingredient.factory.PizzaIngredientsFactoryCreator;
import com.patterns.pattern.abstractfactory.pizzastore.ingredient.factory.PizzaIngredientsType;
import com.patterns.pattern.abstractfactory.pizzastore.pizza.*;
import com.patterns.pattern.abstractfactory.surgery.SurgeryModel;
import com.patterns.pattern.abstractfactory.surgery.factory.SurgeryPartsAbstractFactory;
import com.patterns.pattern.abstractfactory.surgery.factory.SurgeryPartsType;
import com.patterns.run.PatternRunner;

import static java.lang.System.out;

public class AbstractFactoryRunner implements PatternRunner {

    @Override
    public void run() {
//        demoSurgery();
        demoPizza();
    }

    private static void demoSurgery() {
        out.println("PERFORM REAL SURGERY");
        performSurgery(SurgeryPartsType.REAL);
        out.println("\nPRACTICE SURGERY");
        performSurgery(SurgeryPartsType.STUDY);
        out.println("\nPLAY SURGERY GAME");
        performSurgery(SurgeryPartsType.TOY);
    }

    private static void performSurgery(SurgeryPartsType surgeryPartsType) {
        SurgeryModel surgeryModel = new SurgeryModel(SurgeryPartsAbstractFactory.getSurgeryPartsFactory(surgeryPartsType));
        surgeryModel.performSurgery();
    }

    private static void demoPizza() {
        makePizza(PizzaType.CHICKEN, PizzaIngredientsType.ARMENIAN);
        makePizza(PizzaType.CHICKEN, PizzaIngredientsType.USA);
        makePizza(PizzaType.HAM, PizzaIngredientsType.ARMENIAN);
        makePizza(PizzaType.HAM, PizzaIngredientsType.USA);
        makePizza(PizzaType.PEPPERONI, PizzaIngredientsType.ARMENIAN);
        makePizza(PizzaType.PEPPERONI, PizzaIngredientsType.USA);
    }

    private static void makePizza(PizzaType pizzaType, PizzaIngredientsType pizzaIngredientsType) {
        createPizza(pizzaType, pizzaIngredientsType).make();
        out.println();
    }

    private static Pizza createPizza(PizzaType pizzaType, PizzaIngredientsType pizzaIngredientsType) {
        PizzaIngredientFactory pizzaIngredientsFactory = PizzaIngredientsFactoryCreator.createPizzaIngredientsFactory(pizzaIngredientsType);
        switch (pizzaType) {
            case HAM:
                return new HamPizza(pizzaIngredientsFactory);
            case CHICKEN:
                return new ChickenPizza(pizzaIngredientsFactory);
            case PEPPERONI:
                return new PepperoniPizza(pizzaIngredientsFactory);
            default:
                throw new RuntimeException("Unhandled pizza type: " + pizzaType);
        }
    }
}

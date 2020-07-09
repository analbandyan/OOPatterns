package com.patterns.pattern.abstractfactory.pizzastore.ingredient.factory;

import com.patterns.pattern.abstractfactory.pizzastore.ingredient.cheese.Cheese;
import com.patterns.pattern.abstractfactory.pizzastore.ingredient.clam.Clam;
import com.patterns.pattern.abstractfactory.pizzastore.ingredient.dough.Dough;
import com.patterns.pattern.abstractfactory.pizzastore.ingredient.sauce.Sauce;

public interface PizzaIngredientFactory {

    String getIngredientsFamilyName();

    Dough createDough();

    Cheese createCheese();

    Clam createClam();

    Sauce createSauce();

}

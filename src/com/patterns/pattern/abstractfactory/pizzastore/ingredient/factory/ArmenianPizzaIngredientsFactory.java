package com.patterns.pattern.abstractfactory.pizzastore.ingredient.factory;

import com.patterns.pattern.abstractfactory.pizzastore.ingredient.cheese.Cheese;
import com.patterns.pattern.abstractfactory.pizzastore.ingredient.cheese.LoriCheese;
import com.patterns.pattern.abstractfactory.pizzastore.ingredient.clam.Clam;
import com.patterns.pattern.abstractfactory.pizzastore.ingredient.clam.FrozenClam;
import com.patterns.pattern.abstractfactory.pizzastore.ingredient.dough.Dough;
import com.patterns.pattern.abstractfactory.pizzastore.ingredient.dough.ThinDough;
import com.patterns.pattern.abstractfactory.pizzastore.ingredient.sauce.TomatoSauce;
import com.patterns.pattern.abstractfactory.pizzastore.ingredient.sauce.Sauce;

public class ArmenianPizzaIngredientsFactory implements PizzaIngredientFactory {

    @Override
    public String getIngredientsFamilyName() {
        return "ARMENIAN STYLE";
    }

    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Cheese createCheese() {
        return new LoriCheese();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}

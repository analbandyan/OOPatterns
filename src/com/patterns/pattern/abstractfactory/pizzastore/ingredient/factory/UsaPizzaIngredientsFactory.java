package com.patterns.pattern.abstractfactory.pizzastore.ingredient.factory;

import com.patterns.pattern.abstractfactory.pizzastore.ingredient.cheese.Cheese;
import com.patterns.pattern.abstractfactory.pizzastore.ingredient.cheese.ColbyCheese;
import com.patterns.pattern.abstractfactory.pizzastore.ingredient.clam.Clam;
import com.patterns.pattern.abstractfactory.pizzastore.ingredient.clam.FreshClam;
import com.patterns.pattern.abstractfactory.pizzastore.ingredient.dough.Dough;
import com.patterns.pattern.abstractfactory.pizzastore.ingredient.dough.ThickDough;
import com.patterns.pattern.abstractfactory.pizzastore.ingredient.sauce.Sauce;
import com.patterns.pattern.abstractfactory.pizzastore.ingredient.sauce.MarinaraSauce;

public class UsaPizzaIngredientsFactory implements PizzaIngredientFactory {

    @Override
    public String getIngredientsFamilyName() {
        return "USA STYLE";
    }

    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Cheese createCheese() {
        return new ColbyCheese();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

}

package com.patterns.pattern.templatemethod.sandwich;

import static java.lang.System.out;

public class BeefSandwich extends SandwichRecipe {

    @Override
    protected void putMainComponent() {
        out.println("Beef slice");
    }

    @Override
    protected void putSauces() {
        out.println("Barbeque and spicy sauces");
    }

    @Override
    protected boolean speciesWanted() {
        return false;
    }
}

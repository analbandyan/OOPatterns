package com.patterns.pattern.templatemethod.sandwich;

import static java.lang.System.out;

public class ChickenSandwich extends SandwichRecipe {

    @Override
    protected void putMainComponent() {
        out.println("Chicken breast");
    }

    @Override
    protected boolean speciesWanted() {
        return false;
    }

    @Override
    protected void putSpecies() {
        //mp species
    }

    @Override
    protected void putSauces() {
        out.println("Barbeque sauce");
    }
}

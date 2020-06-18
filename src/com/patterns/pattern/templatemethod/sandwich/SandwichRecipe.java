package com.patterns.pattern.templatemethod.sandwich;

import static java.lang.System.out;

public abstract class SandwichRecipe {

    //template method
    public final void makeOne() {
        takeSplittedBread();
        putMarol();
        putMainComponent();
        if(speciesWanted()) {
            putSpecies();
        }
        putSauces();
    }

    private void takeSplittedBread() {
        out.println("Splitted bread");
    }

    private void putMarol() {
        out.println("Marol");
    }

    protected abstract void putMainComponent();

    protected boolean speciesWanted() {
        return true;
    }

    protected void putSpecies() {
        out.println("Salt and paper");
    }

    protected abstract void putSauces();

}

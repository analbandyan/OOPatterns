package com.patterns.pattern.templatemethod;

import com.patterns.pattern.templatemethod.construction.BuildingConstruction;
import com.patterns.pattern.templatemethod.construction.BusinessCenterBuildingConstruction;
import com.patterns.pattern.templatemethod.construction.ResidentialBuildingConstruction;
import com.patterns.pattern.templatemethod.sandwich.BeefSandwich;
import com.patterns.pattern.templatemethod.sandwich.ChickenSandwich;
import com.patterns.pattern.templatemethod.sandwich.SandwichRecipe;
import com.patterns.run.PatternRunner;

import static java.lang.System.out;

public class TemlpateMethodRunner implements PatternRunner {
    @Override
    public void run() {
//        demoSandwich();
        demoBuildingConstruction();
    }

    private static void demoSandwich() {
        makeSandwich(createChickenSandwich());
        out.println();
        makeSandwich(createBeefSandwich());
    }

    private static void makeSandwich(SandwichRecipe sandwichRecipe) {
        sandwichRecipe.makeOne();
    }

    private static SandwichRecipe createChickenSandwich() {
        return new ChickenSandwich();
    }

    private static SandwichRecipe createBeefSandwich() {
        return new BeefSandwich();
    }

    private static void demoBuildingConstruction() {
        constructBuilding(getResidentialBuildingConstruction());
        out.println();
        constructBuilding(getBusinessCenterBuildingConstruction());
    }

    private static BuildingConstruction getResidentialBuildingConstruction() {
        return new ResidentialBuildingConstruction();
    }

    private static BuildingConstruction getBusinessCenterBuildingConstruction() {
        return new BusinessCenterBuildingConstruction();
    }

    private static void constructBuilding(BuildingConstruction buildingConstruction) {
        buildingConstruction.construct();
    }
}

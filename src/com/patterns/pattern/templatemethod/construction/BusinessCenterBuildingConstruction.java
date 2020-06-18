package com.patterns.pattern.templatemethod.construction;

import static java.lang.System.out;

public class BusinessCenterBuildingConstruction extends BuildingConstruction {

    @Override
    protected void installHeatingSystem() {
        out.println("Install central heating system");
    }

    @Override
    protected void installCoolingSystem() {
        out.println("Install central cooling system");
    }

    @Override
    protected void installWindows() {
        out.println("Install stained, high quality windows with voice isolation and ultra-violet rays protection.");
    }

    @Override
    protected boolean hasGarden() {
        return false;
    }

    @Override
    protected void buildGarden() {
        //no garden
    }
}

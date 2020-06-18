package com.patterns.pattern.templatemethod.construction;

import static java.lang.System.out;

abstract public class BuildingConstruction {

    public final void construct() {
        buildParkings();
        buildBuildings();
        installSewageSystem();
        installHeatingSystem();
        installCoolingSystem();
        installWindows();
        if (hasGarden()) {
            buildGarden();
        }
    }

    private void buildParkings() {
        out.println("Build parkings");
    }

    private void buildBuildings() {
        out.println("Build buildings");
    }

    private void installSewageSystem() {
        out.println("Install sewage system.");
    }

    protected abstract void installHeatingSystem();

    protected abstract void installCoolingSystem();

    protected abstract void installWindows();

    protected boolean hasGarden() {
        return true;
    }

    protected abstract void buildGarden();


}

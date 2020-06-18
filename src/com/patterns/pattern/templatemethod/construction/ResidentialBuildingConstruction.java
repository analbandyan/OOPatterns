package com.patterns.pattern.templatemethod.construction;

import static java.lang.System.out;

public class ResidentialBuildingConstruction extends BuildingConstruction {


    @Override
    protected void installHeatingSystem() {
        out.println("Install individual heating system");
    }

    @Override
    protected void installCoolingSystem() {
        out.println("Install individual cooling system");
    }

    @Override
    protected void installWindows() {
        out.println("Install windows");
    }

    @Override
    protected void buildGarden() {
        out.println("Build garden with playgrounds and boulevard");
    }
}

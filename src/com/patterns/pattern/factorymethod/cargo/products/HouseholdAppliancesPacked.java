package com.patterns.pattern.factorymethod.cargo.products;

public class HouseholdAppliancesPacked implements Cargo {

    @Override
    public String getDescription() {
        return "Household appliances in packed form";
    }

}

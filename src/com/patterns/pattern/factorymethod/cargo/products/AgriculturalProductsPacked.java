package com.patterns.pattern.factorymethod.cargo.products;

public class AgriculturalProductsPacked implements Cargo {

    @Override
    public String getDescription() {
        return "Agricultural products in packed form";
    }

}

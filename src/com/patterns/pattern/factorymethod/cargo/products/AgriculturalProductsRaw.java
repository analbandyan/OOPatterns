package com.patterns.pattern.factorymethod.cargo.products;

public class AgriculturalProductsRaw implements Cargo {

    @Override
    public String getDescription() {
        return "Agricultural products in raw form";
    }

}

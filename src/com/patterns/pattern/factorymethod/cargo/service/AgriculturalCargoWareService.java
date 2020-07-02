package com.patterns.pattern.factorymethod.cargo.service;

import com.patterns.pattern.factorymethod.cargo.products.AgriculturalProductsPacked;
import com.patterns.pattern.factorymethod.cargo.products.AgriculturalProductsRaw;
import com.patterns.pattern.factorymethod.cargo.products.Cargo;

public class AgriculturalCargoWareService extends CargoWareService {

    @Override
    protected Cargo receiveCargo(CargoPackaging cargoPackaging) {
        switch (cargoPackaging) {
            case PACKED:
                return new AgriculturalProductsPacked();
            case RAW:
                return new AgriculturalProductsRaw();
            default:
                throw new RuntimeException("Unknown cargo packaging: " + cargoPackaging);
        }
    }

}

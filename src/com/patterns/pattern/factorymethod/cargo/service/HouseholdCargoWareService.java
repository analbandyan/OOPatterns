package com.patterns.pattern.factorymethod.cargo.service;

import com.patterns.pattern.factorymethod.cargo.products.Cargo;
import com.patterns.pattern.factorymethod.cargo.products.HouseholdAppliancesPacked;
import com.patterns.pattern.factorymethod.cargo.products.HouseholdAppliancesRaw;

public class HouseholdCargoWareService extends CargoWareService {

    @Override
    protected Cargo receiveCargo(CargoPackaging cargoPackaging) {
        switch (cargoPackaging) {
            case PACKED:
                return new HouseholdAppliancesPacked();
            case RAW:
                return new HouseholdAppliancesRaw();
            default:
                throw new RuntimeException("Unknown cargo packaging: " + cargoPackaging);
        }
    }

}

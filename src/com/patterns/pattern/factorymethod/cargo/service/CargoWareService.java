package com.patterns.pattern.factorymethod.cargo.service;

import com.patterns.pattern.factorymethod.cargo.products.Cargo;

import java.util.Random;

import static java.lang.System.out;

abstract public class CargoWareService {

    public void processCargo(CargoPackaging cargoPackaging) {
        Cargo cargo = receiveCargo(cargoPackaging);
        out.println("Received " + cargo.getDescription());
        if(isLegal(cargo)) {
            loadGoodsIntoContainer(cargo);
            organizePaperwork(cargo);
            getPartOfThePayment(cargo);
            transportCargo(cargo);
            getTheResOfThePayment(cargo);
        } else {
            out.println("Cargo is not legal, rejecting.");
        }
    }

    private boolean isLegal(Cargo cargo) {
        return new Random().nextBoolean();
    }

    private void loadGoodsIntoContainer(Cargo cargo) {
        out.println("Load " + cargo.getDescription() + " into container.");
    }

    private void organizePaperwork(Cargo cargo) {
        out.println("Organize paperwork for " + cargo.getDescription());
    }

    private void getPartOfThePayment(Cargo cargo) {
        out.println("Get part of the payment for " + cargo.getDescription());
    }

    private void transportCargo(Cargo cargo) {
        out.println("Transporting " + cargo.getDescription());
    }

    private void getTheResOfThePayment(Cargo cargo) {
        out.println("Get the rest of the payment for " + cargo.getDescription());
    }

    abstract protected Cargo receiveCargo(CargoPackaging cargoPackaging);

}

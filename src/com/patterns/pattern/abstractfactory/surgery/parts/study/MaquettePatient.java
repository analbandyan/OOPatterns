package com.patterns.pattern.abstractfactory.surgery.parts.study;

import com.patterns.pattern.abstractfactory.surgery.parts.base.Patient;

public class MaquettePatient implements Patient {
    @Override
    public String getName() {
        return "Maquette Patient";
    }
}

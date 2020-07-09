package com.patterns.pattern.abstractfactory.surgery.parts.toy;

import com.patterns.pattern.abstractfactory.surgery.parts.base.Patient;

public class DollPatient implements Patient {
    @Override
    public String getName() {
        return "Patient Doll";
    }
}

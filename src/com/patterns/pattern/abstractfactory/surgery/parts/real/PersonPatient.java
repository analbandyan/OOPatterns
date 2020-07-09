package com.patterns.pattern.abstractfactory.surgery.parts.real;

import com.patterns.pattern.abstractfactory.surgery.parts.base.Patient;

public class PersonPatient implements Patient {
    @Override
    public String getName() {
        return "Person patient";
    }
}

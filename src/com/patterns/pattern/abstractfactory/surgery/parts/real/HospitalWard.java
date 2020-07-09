package com.patterns.pattern.abstractfactory.surgery.parts.real;

import com.patterns.pattern.abstractfactory.surgery.parts.base.Ward;

public class HospitalWard implements Ward {
    @Override
    public String getName() {
        return "Hospital Ward";
    }
}

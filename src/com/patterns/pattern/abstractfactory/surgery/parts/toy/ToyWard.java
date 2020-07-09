package com.patterns.pattern.abstractfactory.surgery.parts.toy;

import com.patterns.pattern.abstractfactory.surgery.parts.base.Ward;

public class ToyWard implements Ward {
    @Override
    public String getName() {
        return "Toy Ward";
    }
}

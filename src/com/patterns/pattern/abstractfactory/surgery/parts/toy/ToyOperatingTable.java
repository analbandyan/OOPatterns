package com.patterns.pattern.abstractfactory.surgery.parts.toy;

import com.patterns.pattern.abstractfactory.surgery.parts.base.OperatingTable;

public class ToyOperatingTable implements OperatingTable {
    @Override
    public String getName() {
        return "Toy Operating Table";
    }
}

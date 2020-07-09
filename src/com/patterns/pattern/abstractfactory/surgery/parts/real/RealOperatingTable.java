package com.patterns.pattern.abstractfactory.surgery.parts.real;

import com.patterns.pattern.abstractfactory.surgery.parts.base.OperatingTable;

public class RealOperatingTable implements OperatingTable {
    @Override
    public String getName() {
        return "Operating Table";
    }
}

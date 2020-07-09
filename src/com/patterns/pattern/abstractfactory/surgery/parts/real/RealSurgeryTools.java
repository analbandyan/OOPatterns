package com.patterns.pattern.abstractfactory.surgery.parts.real;

import com.patterns.pattern.abstractfactory.surgery.parts.base.SurgeryTools;

public class RealSurgeryTools implements SurgeryTools {
    @Override
    public String getName() {
        return "Real Surgery Tools";
    }
}

package com.patterns.pattern.abstractfactory.surgery.parts.toy;

import com.patterns.pattern.abstractfactory.surgery.parts.base.SurgeryTools;

public class ToySurgeryTools implements SurgeryTools {
    @Override
    public String getName() {
        return "Toy SurgeryModel Tools";
    }
}

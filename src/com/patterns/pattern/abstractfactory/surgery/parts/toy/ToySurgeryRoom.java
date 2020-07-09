package com.patterns.pattern.abstractfactory.surgery.parts.toy;

import com.patterns.pattern.abstractfactory.surgery.parts.base.SurgeryRoom;

public class ToySurgeryRoom implements SurgeryRoom {
    @Override
    public String getName() {
        return "Toy SurgeryModel Room";
    }
}

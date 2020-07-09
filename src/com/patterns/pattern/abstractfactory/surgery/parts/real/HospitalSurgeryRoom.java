package com.patterns.pattern.abstractfactory.surgery.parts.real;

import com.patterns.pattern.abstractfactory.surgery.parts.base.SurgeryRoom;

public class HospitalSurgeryRoom implements SurgeryRoom {
    @Override
    public String getName() {
        return "SurgeryModel Room";
    }
}

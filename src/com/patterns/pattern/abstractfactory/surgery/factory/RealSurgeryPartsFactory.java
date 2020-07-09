package com.patterns.pattern.abstractfactory.surgery.factory;

import com.patterns.pattern.abstractfactory.surgery.parts.base.*;
import com.patterns.pattern.abstractfactory.surgery.parts.real.*;

public class RealSurgeryPartsFactory implements SurgeryPartsFactory {
    @Override
    public Assistants createAssistants() {
        return new RealAssistants();
    }

    @Override
    public OperatingTable createOperatingTable() {
        return new RealOperatingTable();
    }

    @Override
    public Patient createPatient() {
        return new PersonPatient();
    }

    @Override
    public SurgeryRoom createSurgeryRoom() {
        return new HospitalSurgeryRoom();
    }

    @Override
    public SurgeryTools createSurgeryTools() {
        return new RealSurgeryTools();
    }

    @Override
    public Ward createWard() {
        return new HospitalWard();
    }
}

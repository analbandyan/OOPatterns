package com.patterns.pattern.abstractfactory.surgery.factory;

import com.patterns.pattern.abstractfactory.surgery.parts.base.*;
import com.patterns.pattern.abstractfactory.surgery.parts.toy.*;

public class ToySurgeryPartsFactory implements SurgeryPartsFactory {
    @Override
    public Assistants createAssistants() {
        return new AssistantDolls();
    }

    @Override
    public OperatingTable createOperatingTable() {
        return new ToyOperatingTable();
    }

    @Override
    public Patient createPatient() {
        return new DollPatient();
    }

    @Override
    public SurgeryRoom createSurgeryRoom() {
        return new ToySurgeryRoom();
    }

    @Override
    public SurgeryTools createSurgeryTools() {
        return new ToySurgeryTools();
    }

    @Override
    public Ward createWard() {
        return new ToyWard();
    }
}

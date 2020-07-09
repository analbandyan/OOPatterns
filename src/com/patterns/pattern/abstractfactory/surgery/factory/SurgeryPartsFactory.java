package com.patterns.pattern.abstractfactory.surgery.factory;

import com.patterns.pattern.abstractfactory.surgery.parts.base.*;

public interface SurgeryPartsFactory {

    Assistants createAssistants();

    OperatingTable createOperatingTable();

    Patient createPatient();

    SurgeryRoom createSurgeryRoom();

    SurgeryTools createSurgeryTools();

    Ward createWard();
}

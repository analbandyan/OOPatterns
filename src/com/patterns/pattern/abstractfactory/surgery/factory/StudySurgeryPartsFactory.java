package com.patterns.pattern.abstractfactory.surgery.factory;

import com.patterns.pattern.abstractfactory.surgery.parts.base.*;
import com.patterns.pattern.abstractfactory.surgery.parts.real.RealOperatingTable;
import com.patterns.pattern.abstractfactory.surgery.parts.real.RealSurgeryTools;
import com.patterns.pattern.abstractfactory.surgery.parts.study.*;

public class StudySurgeryPartsFactory implements SurgeryPartsFactory {
    @Override
    public Assistants createAssistants() {
        return new ClassmateAssistants();
    }

    @Override
    public OperatingTable createOperatingTable() {
        return new RealOperatingTable();
    }

    @Override
    public Patient createPatient() {
        return new MaquettePatient();
    }

    @Override
    public SurgeryRoom createSurgeryRoom() {
        return new UniversityLaboratorySurgeryRoom();
    }

    @Override
    public SurgeryTools createSurgeryTools() {
        return new RealSurgeryTools();
    }

    @Override
    public Ward createWard() {
        return new UniversityLaboratoryWard();
    }
}

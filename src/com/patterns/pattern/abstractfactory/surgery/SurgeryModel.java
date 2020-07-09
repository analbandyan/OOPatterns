package com.patterns.pattern.abstractfactory.surgery;

import com.patterns.pattern.abstractfactory.surgery.factory.SurgeryPartsFactory;
import com.patterns.pattern.abstractfactory.surgery.parts.base.Patient;

import static java.lang.System.out;

public class SurgeryModel {

    private SurgeryPartsFactory surgeryPartsFactory;

    public SurgeryModel(SurgeryPartsFactory surgeryPartsFactory) {
        this.surgeryPartsFactory = surgeryPartsFactory;
    }

    public void performSurgery() {
        out.println("Wash and prepare " + surgeryPartsFactory.createSurgeryTools().getName());
        out.println("Instruct " + surgeryPartsFactory.createAssistants().getName());
        Patient patient = surgeryPartsFactory.createPatient();
        out.println("Conduct " + patient.getName() + " to " + surgeryPartsFactory.createSurgeryRoom().getName());
        out.println("Move " + patient.getName() + " to " + surgeryPartsFactory.createOperatingTable().getName());
        out.println("Prepare " + patient.getName());
        out.println("Do anesthesia to " + patient.getName());
        out.println("Perform surgery to " + patient.getName());
        out.println("Move " + patient.getName() + " to " + surgeryPartsFactory.createWard());
    }

}

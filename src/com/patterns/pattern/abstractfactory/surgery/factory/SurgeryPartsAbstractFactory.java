package com.patterns.pattern.abstractfactory.surgery.factory;

public class SurgeryPartsAbstractFactory {

    public static SurgeryPartsFactory getSurgeryPartsFactory(SurgeryPartsType surgeryPartsType) {
        switch (surgeryPartsType) {
            case REAL:
                return new RealSurgeryPartsFactory();
            case STUDY:
                return new StudySurgeryPartsFactory();
            case TOY:
                return new ToySurgeryPartsFactory();
            default:
                throw new RuntimeException("Unhandled surtery parts type: " + surgeryPartsType);
        }
    }

}

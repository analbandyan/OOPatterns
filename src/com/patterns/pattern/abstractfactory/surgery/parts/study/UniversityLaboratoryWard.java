package com.patterns.pattern.abstractfactory.surgery.parts.study;

import com.patterns.pattern.abstractfactory.surgery.parts.base.Ward;

public class UniversityLaboratoryWard implements Ward {
    @Override
    public String getName() {
        return "University Laboratory Ward";
    }
}

package com.patterns.pattern.facade.smarthome.light;

import java.util.Arrays;

public class LightSystemDefault implements LightSystem {

    @Override
    public void setLightLevel(LightLevel lightLevel) {
        System.out.println("Turn light level to " + lightLevel);
    }

    @Override
    public void selfCheck() {
        System.out.println("Testing all the light levels");
        Arrays.stream(LightLevel.values())
                .forEach(this::setLightLevel);
    }

    @Override
    public void off() {
        System.out.println("Light system is switched off.");
    }
}

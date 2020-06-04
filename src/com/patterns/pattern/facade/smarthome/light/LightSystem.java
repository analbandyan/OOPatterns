package com.patterns.pattern.facade.smarthome.light;

public interface LightSystem {

    void setLightLevel(LightLevel lightLevel);

    void selfCheck();

    void off();

}

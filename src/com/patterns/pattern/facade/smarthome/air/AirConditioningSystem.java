package com.patterns.pattern.facade.smarthome.air;

public interface AirConditioningSystem {

    void setTemperature(int temperature);

    void setHumidity(int humidity);

    void off();

}

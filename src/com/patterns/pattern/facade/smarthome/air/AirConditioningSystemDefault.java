package com.patterns.pattern.facade.smarthome.air;

public class AirConditioningSystemDefault implements AirConditioningSystem {

    private static int TEMP_MAX = 35;
    private static int TEMP_MIN = 8;
    private static int HUMIDITY_MAX = 85;
    private static int HUMIDITY_MIN = 20;

    @Override
    public void setTemperature(int temperature) {
        int temperatureAcceptable =
                Math.min(
                        Math.max(TEMP_MIN, temperature), TEMP_MAX
                );

        System.out.println("Set temperature to " + temperatureAcceptable + " celsius");
    }

    @Override
    public void setHumidity(int humidity) {
        int humidityAcceptable =
                Math.min(
                        Math.max(HUMIDITY_MIN, humidity), HUMIDITY_MAX
                );

        System.out.println("Set humidity to " + humidityAcceptable + "%");
    }

    @Override
    public void off() {
        System.out.println("Air conditioning system is switched off.");
    }
}

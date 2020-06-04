package com.patterns.pattern.facade.smarthome;

import com.patterns.pattern.facade.smarthome.air.AirConditioningSystem;
import com.patterns.pattern.facade.smarthome.air.AirConditioningSystemDefault;
import com.patterns.pattern.facade.smarthome.light.LightLevel;
import com.patterns.pattern.facade.smarthome.light.LightSystem;
import com.patterns.pattern.facade.smarthome.light.LightSystemDefault;
import com.patterns.pattern.facade.smarthome.sound.EqualizerMode;
import com.patterns.pattern.facade.smarthome.sound.SoundSystem;
import com.patterns.pattern.facade.smarthome.sound.SoundSystemDefault;
import com.patterns.pattern.facade.smarthome.sound.VolumeLevel;

import static java.lang.System.out;

public class SmartHome {

    private final AirConditioningSystem airConditioningSystem;
    private final LightSystem lightSystem;
    private final SoundSystem soundSystem;

    public SmartHome() {
        airConditioningSystem = new AirConditioningSystemDefault();
        lightSystem = new LightSystemDefault();
        soundSystem = new SoundSystemDefault();
    }

    public void switchToWorkoutMode() {
        out.println("Switching Smart Home to workout mode");
        airConditioningSystem.setTemperature(20);
        airConditioningSystem.setHumidity(40);
        lightSystem.setLightLevel(LightLevel.BRIGHT);
        soundSystem.setVolumeLevel(VolumeLevel.MEDIUM);
        soundSystem.setEqualizerMode(EqualizerMode.MUSIC);
    }

    public void switchToMaintenanceMode() {
        out.println("Switching Smart Home to maintenance mode");
        airConditioningSystem.setTemperature(25);
        airConditioningSystem.setHumidity(60);
        lightSystem.setLightLevel(LightLevel.OFF);
        soundSystem.setVolumeLevel(VolumeLevel.OFF);
    }

    public void switchToPartyMode() {
        out.println("Switching Smart Home to party mode");
        airConditioningSystem.setTemperature(23);
        airConditioningSystem.setHumidity(45);
        lightSystem.setLightLevel(LightLevel.MEDIUM);
        soundSystem.setVolumeLevel(VolumeLevel.LOUD);
        soundSystem.setEqualizerMode(EqualizerMode.MUSIC);
    }

    public void switchToRestMode() {
        out.println("Switching Smart Home to rest mode");
        airConditioningSystem.setTemperature(25);
        airConditioningSystem.setHumidity(50);
        lightSystem.setLightLevel(LightLevel.DARK);
        soundSystem.setVolumeLevel(VolumeLevel.SOFT);
        soundSystem.setEqualizerMode(EqualizerMode.MUSIC);
    }

    public void switchOff() {
        out.println("Switching Smart Home off");
        airConditioningSystem.off();
        lightSystem.off();
        soundSystem.off();;
    }

}

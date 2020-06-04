package com.patterns.pattern.facade.smarthome.sound;

public class SoundSystemDefault implements SoundSystem {

    @Override
    public void setVolumeLevel(VolumeLevel volumeLevel) {
        System.out.println("Set sound system volume to " + volumeLevel);
    }

    @Override
    public void setEqualizerMode(EqualizerMode equalizerMode) {
        System.out.println("Set sound system equalizer to " + equalizerMode);
    }

    @Override
    public void off() {
        System.out.println("Sound system is switched off.");
    }

}

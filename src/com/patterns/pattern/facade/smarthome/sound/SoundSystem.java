package com.patterns.pattern.facade.smarthome.sound;

public interface SoundSystem {

    void setVolumeLevel(VolumeLevel volumeLevel);

    void setEqualizerMode(EqualizerMode equalizerMode);

    void off();

}

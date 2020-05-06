package com.patterns.pattern.bridge;

import com.patterns.pattern.bridge.audioplayer.AudioPlayer;
import com.patterns.pattern.bridge.audioplayer.MusicSourceImpl;
import com.patterns.run.PatternRunner;

public class BridgeRunner implements PatternRunner {
    @Override
    public void run() {
        demoAudioPlayer();
    }

    private static void demoAudioPlayer() {
        AudioPlayer audioPlayer = new AudioPlayer(new MusicSourceImpl(/* hint: maybe some trick here? */));
        audioPlayer.playGoodMusic();
    }
}

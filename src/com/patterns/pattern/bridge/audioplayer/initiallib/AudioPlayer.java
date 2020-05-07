package com.patterns.pattern.bridge.audioplayer.initiallib;

import java.util.Arrays;

import static java.lang.System.out;

public class AudioPlayer {

    private MusicSource musicSource;

    public AudioPlayer(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    public void setMusicSource(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    public void playGoodMusic() {
        String[] joeCockerMusicRefs = musicSource.findMusicByAuthor("Michael Jackson");
        out.println("found music by Author Michael Jackson: " + Arrays.toString(joeCockerMusicRefs));

        String[] jazzSongRefs = musicSource.findMusicByGenre("Jazz");
        out.println("found music by Genre Jazz: " + Arrays.toString(jazzSongRefs));

        String musicContent = musicSource.fetchMusicContent(jazzSongRefs[0]);
        out.println("Playing music: " + musicContent + "...");

        out.println();
    }

}

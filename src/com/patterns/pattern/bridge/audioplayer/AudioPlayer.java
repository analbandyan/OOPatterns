package com.patterns.pattern.bridge.audioplayer;

public class AudioPlayer {

    private final MusicSource musicSource;

    public AudioPlayer(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    public void playGoodMusic() {
        String[] joeCockerMusicRefs = musicSource.findMusicByAuthor("Michael Jackson");
        playMultiple("Michael Jackson", joeCockerMusicRefs);

        String[] jazzSongRefs = musicSource.findMusicByGenre("Jazz");
        playMultiple("Jazz", jazzSongRefs);
    }

    private void playMultiple(String indicator, String[] musicRefs) {
        for (String musicRef: musicRefs) {
            byte[] musicContent = musicSource.fetchMusicContent(musicRef);
            playMusic(indicator, musicContent);
        }
    }

    private static void playMusic(String indicator, byte[] musicContent) {
        System.out.println("Playing " + indicator + ": " + new String(musicContent) + "...");
    }

}

package com.patterns.pattern.bridge.audioplayer.initiallib;

public interface MusicSource {

    String[] /*references*/ findMusicByAuthor(String author);
    String[] /*references*/ findMusicByGenre(String genre);
    String fetchMusicContent(String reference);

}

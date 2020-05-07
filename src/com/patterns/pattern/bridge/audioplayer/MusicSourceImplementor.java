package com.patterns.pattern.bridge.audioplayer;

import java.util.List;

public interface MusicSourceImplementor {

    List<String> findAllByAuthor(String author);

    List<String> findAllByGenre(String genre);

    byte[] fetchMusicContent(String reference);

}

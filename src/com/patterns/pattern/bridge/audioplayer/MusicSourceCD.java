package com.patterns.pattern.bridge.audioplayer;

import java.util.List;

public class MusicSourceCD implements MusicSourceImplementor {

    @Override
    public List<String> findAllByAuthor(String author) {
        return List.of("CD: REF music by author 1", "TAPE: music by author 2");
    }

    @Override
    public List<String> findAllByGenre(String genre) {
        return List.of("CD: REF music by genre 1", "TAPE: music by genre 2");
    }

    @Override
    public byte[] fetchMusicContent(String reference) {
        return "CD: music content".getBytes();
    }

}

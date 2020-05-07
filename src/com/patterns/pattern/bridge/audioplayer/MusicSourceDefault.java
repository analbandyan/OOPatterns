package com.patterns.pattern.bridge.audioplayer;

import com.patterns.pattern.bridge.audioplayer.initiallib.MusicSource;

public class MusicSourceDefault implements MusicSource {

    private MusicSourceImplementor musicSourceImplementor;

    public MusicSourceDefault(MusicSourceImplementor musicSourceImplementor) {
        this.musicSourceImplementor = musicSourceImplementor;
    }

    @Override
    public String[] findMusicByAuthor(String author) {
        return musicSourceImplementor.findAllByAuthor(author).toArray(String[]::new);
    }

    @Override
    public String[] findMusicByGenre(String genre) {
        return musicSourceImplementor.findAllByGenre(genre).toArray(String[]::new);
    }

    @Override
    public String fetchMusicContent(String reference) {
        return new String(
                musicSourceImplementor.fetchMusicContent(reference)
        );
    }

    public void setMusicSourceImplementor(MusicSourceImplementor musicSourceImplementor) {
        this.musicSourceImplementor = musicSourceImplementor;
    }
}

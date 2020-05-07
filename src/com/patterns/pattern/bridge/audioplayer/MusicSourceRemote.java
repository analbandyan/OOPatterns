package com.patterns.pattern.bridge.audioplayer;

import static java.lang.System.out;

public class MusicSourceRemote extends MusicSourceDefault {

    public MusicSourceRemote(MusicSourceImplementor musicSourceImplementor) {
        super(musicSourceImplementor);
    }

    @Override
    public String[] findMusicByAuthor(String author) {
        out.print("REMOTE--->");
        return super.findMusicByAuthor(author);
    }

    @Override
    public String[] findMusicByGenre(String genre) {
        out.print("REMOTE--->");
        return super.findMusicByGenre(genre);
    }

    @Override
    public String fetchMusicContent(String reference) {
        out.print("REMOTE--->");
        return super.fetchMusicContent(reference);
    }
}

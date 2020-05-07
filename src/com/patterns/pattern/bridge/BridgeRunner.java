package com.patterns.pattern.bridge;

import com.patterns.pattern.bridge.audioplayer.*;
import com.patterns.pattern.bridge.audioplayer.initiallib.AudioPlayer;
import com.patterns.pattern.bridge.persistence.*;
import com.patterns.run.PatternRunner;

import static java.lang.System.out;

public class BridgeRunner implements PatternRunner {
    @Override
    public void run() {
        out.println("DEMO AUDIO PLAYER\n");
        demoAudioPlayer();
        out.println("\n\nDEMO PERSISTENCE\n");
        demoPersistence();
    }

    private static void demoAudioPlayer() {
        MusicSourceDefault musicSourceDefault = new MusicSourceDefault(new MusicSourceTape());

        AudioPlayer audioPlayer = new AudioPlayer(musicSourceDefault);
        audioPlayer.playGoodMusic();

        musicSourceDefault.setMusicSourceImplementor(new MusicSourceCD());
        audioPlayer.playGoodMusic();

        musicSourceDefault.setMusicSourceImplementor(new MusicSourceUSB());
        audioPlayer.playGoodMusic();


        MusicSourceRemote musicSourceRemote = new MusicSourceRemote(new MusicSourceTape());

        audioPlayer.setMusicSource(musicSourceRemote);
        audioPlayer.playGoodMusic();

        musicSourceRemote.setMusicSourceImplementor(new MusicSourceCD());
        audioPlayer.playGoodMusic();

        musicSourceRemote.setMusicSourceImplementor(new MusicSourceUSB());
        audioPlayer.playGoodMusic();

    }


    private static void demoPersistence() {
        doPersistenceDemo(createDBPersistence());
        doPersistenceDemo(createFSPersistence());
        doPersistenceDemo(createDBCachingPersistence());
        doPersistenceDemo(createFSCachingPersistence());
    }

    private static void doPersistenceDemo(Persistence persistence) {
        String id = persistence.persist("object");
        persistence.findById(id);
        persistence.deleteById(id);
        System.out.println();
    }

    private static Persistence createDBPersistence() {
        return new PersistenceDefault(
                new DatabasePersistenceImplementor()
        );
    }

    private static Persistence createFSPersistence() {
        return new PersistenceDefault(
                new FileSystemPersistenceImplementor()
        );
    }

    private static Persistence createDBCachingPersistence() {
        return new PersistenceCaching(
                new DatabasePersistenceImplementor()
        );
    }

    private static Persistence createFSCachingPersistence() {
        return new PersistenceCaching(
                new FileSystemPersistenceImplementor()
        );
    }

    private static PersistenceImplementor getPersistenceImplementor() {
        return dbDriverFound() ? new DatabasePersistenceImplementor() : new FileSystemPersistenceImplementor();
    }

    private static boolean dbDriverFound() {
        return true;
    }
}

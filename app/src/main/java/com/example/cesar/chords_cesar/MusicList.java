package com.example.cesar.chords_cesar;

import java.util.List;
import java.util.LinkedList;

public class MusicList {

    List<Music> musicas = new LinkedList<>();

    public MusicList(){
        initializeMusics();
    }

    public Music searchMusic(Specification spec){

        List<Music> found = new LinkedList<>();
        for(Music music:musicas) if (music.getSpec().matches(spec)) return music;
        return null;

    }

    public void initializeMusics(){
        this.musicas.add(new Music("Note:Capo in the 3rd -- [G] How many special people change [F] How many lives...", new Specification("Oasis", "Champagne Supernova")));
    }
}

package com.example.cesar.chords_cesar;

public class Specification {

    private String band;
    private String musicName;

    public Specification(String band, String musicName){
        this.band = band;
        this.musicName = musicName;
    }

    public boolean matches(Specification spec){
        if(!band.equals(spec.band)) return false;
        if(!musicName.equals(spec.musicName)) return false;
        return true;
    }
}

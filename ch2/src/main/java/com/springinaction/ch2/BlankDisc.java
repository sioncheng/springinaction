package com.springinaction.ch2;

import java.util.List;

public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void play() {
        System.out.println(String.format("Playing %s by %s", this.title, this.artist));
        for (String track : tracks) {
            System.out.println(String.format("Track - %s", track));
        }
    }
}

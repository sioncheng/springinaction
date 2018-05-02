package com.springinaction.ch2;

import org.springframework.stereotype.Component;

@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

    public void play() {
        System.out.println(String.format("Playing %s by %s", title, artist));
    }

    private final String title = "Sgt. Pepper's Lonely Hearts Club Band";

    private final String artist = "The Beatles";
}

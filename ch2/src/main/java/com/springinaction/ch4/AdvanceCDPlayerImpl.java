package com.springinaction.ch4;

import org.springframework.stereotype.Component;

@Component
public class AdvanceCDPlayerImpl implements AdvanceCDPlayer {

    public void play(int trackNumber) {
        System.out.println(String.format("play track %d", trackNumber));
    }
}

package com.springinaction.ch2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

    @Autowired
    public CDPlayer(CompactDisc disc) {
        this.cd = disc;
    }

    public void play() {
        this.cd.play();
    }

    private CompactDisc cd;
}

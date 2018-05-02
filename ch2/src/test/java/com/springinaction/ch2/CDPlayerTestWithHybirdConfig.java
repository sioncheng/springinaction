package com.springinaction.ch2;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig2.class)

public class CDPlayerTestWithHybirdConfig {

    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void mediaPlayerShouldNotBeNull() {
        Assert.assertNotNull(mediaPlayer);
    }

    @Test
    public void play() {
        mediaPlayer.play();
    }
}

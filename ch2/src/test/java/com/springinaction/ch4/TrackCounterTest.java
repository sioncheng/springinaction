package com.springinaction.ch4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterTest {

    @Autowired
    private AdvanceCDPlayer advanceCDPlayer;

    @Test
    public void testPlayTrack() {
        Assert.assertNotNull(advanceCDPlayer);
        advanceCDPlayer.play(1);
        advanceCDPlayer.play(1);
        advanceCDPlayer.play(3);
        advanceCDPlayer.play(2);
        advanceCDPlayer.play(3);
    }
}

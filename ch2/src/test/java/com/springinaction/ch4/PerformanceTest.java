package com.springinaction.ch4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class PerformanceTest {

    @Autowired
    private Performance performance;

    @Test
    public void testPerformance() {
        Assert.assertNotNull(performance);
        performance.perform();
    }
}

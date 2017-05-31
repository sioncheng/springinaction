package com.springinaction.springidol;

/**
 * Created by cyq on 31/05/2017.
 */
public class Juggler implements Performer {

    private int beanBags = 3;

    public Juggler() {

    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public void perform() throws PerformanceException {
        System.out.println(String.format("juggling %d beanbags", beanBags));
    }
}

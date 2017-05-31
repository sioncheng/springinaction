package com.springinaction.springidol;

/**
 * Created by cyq on 31/05/2017.
 */
public class PoeticJuggler extends Juggler {

    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While reciting... ");
        poem.recite();
    }

    private Poem poem;
}

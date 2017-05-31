package com.springinaction.springidol;

/**
 * Created by cyq on 31/05/2017.
 */
public class Instrumentalist implements Performer {

    public Instrumentalist() {

    }

    public void perform() throws PerformanceException {
        System.out.println("sing " + song);
        instrument.play();
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    private String song;

    private Instrument instrument;
}

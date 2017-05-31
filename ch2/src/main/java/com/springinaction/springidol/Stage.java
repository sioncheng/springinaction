package com.springinaction.springidol;

/**
 * Created by cyq on 31/05/2017.
 */
public class Stage {

    private Stage() {

    }


    private static class StageHolder {
        static final Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageHolder.instance;
    }
}

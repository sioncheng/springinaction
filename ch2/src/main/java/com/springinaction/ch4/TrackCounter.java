package com.springinaction.ch4;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Aspect
@Component
public class TrackCounter {

    private Map<Integer, Integer> counter =
            new HashMap<Integer, Integer>();

    @Pointcut("execution(* com.springinaction.ch4.AdvanceCDPlayer.play(int))  && args(trackNumber)")
    public void played(int trackNumber){}

    @After("played(trackNumber)")
    public void count(int trackNumber) {
        Integer k = Integer.valueOf(trackNumber);
        Integer c;
        if (!counter.containsKey(k)) {
            c = 0;
        } else {
            c = counter.get(k);
        }
        c = c + 1;
        counter.put(k, c);

        System.out.println(String.format("track %d has been played %d times", trackNumber, c));
    }

}

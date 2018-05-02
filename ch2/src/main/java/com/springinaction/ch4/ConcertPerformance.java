package com.springinaction.ch4;

import org.springframework.stereotype.Component;

@Component
public class ConcertPerformance implements Performance {

    public void perform() {
        System.out.println("corect performance");
    }
}

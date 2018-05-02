package com.springinaction.ch2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {CompactDisc.class})
public class CDPlayerConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean
    public MediaPlayer cdPlayer(CompactDisc cd) {
        return new CDPlayer(cd);
    }
}

package com.springinaction.ch2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:cd-config.xml")
public class CDPlayerConfig2 {

    @Bean
    public MediaPlayer cdPlayer(CompactDisc cd) {
        return new CDPlayer(cd);
    }
}

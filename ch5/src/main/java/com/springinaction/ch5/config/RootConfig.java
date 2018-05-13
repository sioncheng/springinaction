package com.springinaction.ch5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springinaction.ch5.business")
public class RootConfig {
}

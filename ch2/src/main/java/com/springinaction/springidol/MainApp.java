package com.springinaction.springidol;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cyq on 31/05/2017.
 */
public class MainApp {

    public static void main(String[] args) throws Exception {
        System.out.println("\nMainApp Begin");

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-idol.xml");

        Performer performer  = (Performer) context.getBean("duke");
        performer.perform();
        System.out.println();


        Performer performer1 = (Performer) context.getBean("poeticDuke");
        performer1.perform();
        System.out.println();

        Stage stage = (Stage) context.getBean("theStage");
        Performer performer2 = (Performer) context.getBean("kenny");
        performer2.perform();
        System.out.println();


        System.out.println("\nMainApp End");
    }
}

package com.mlcode.test.demo1;

import com.mlcode.demo1.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

//        //Load the spring configuration file
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
//
//        //retrieve bean from spring container
//        Coach footBallCoachCoach = applicationContext.getBean("footBallCoach", Coach.class);
//
//        Coach alphaFootBallCoach = applicationContext.getBean("footBallCoach", Coach.class);
//
//        System.out.println("Are they same object: " + (footBallCoachCoach == alphaFootBallCoach));
//        System.out.println("Memory Reference of footBallCoachCoach: " + footBallCoachCoach);
//        System.out.println("Memory Reference of alphaFootBallCoach: " + alphaFootBallCoach);
//
//        Coach trackCoach = applicationContext.getBean("trackCoach", Coach.class);
//
//        System.out.println(trackCoach.dailyWorkout());
//
//
//        applicationContext.close();
    }

}

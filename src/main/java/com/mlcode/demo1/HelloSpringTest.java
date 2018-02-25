package com.mlcode.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringTest {

    public static void main(String[] args){
        //load the spring configuration file
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach coach1 = applicationContext.getBean("footBallCoach", Coach.class);
        Coach coach2 = applicationContext.getBean("trackCoach", Coach.class);
        CricketCoach coach3 = applicationContext.getBean("cricketCoach", CricketCoach.class);

        //call methods on the bean
        System.out.println(coach1.dailyWorkout());
        System.out.println(coach1.getDailyFortune());
        System.out.println(coach2.dailyWorkout());
        System.out.println(coach2.getDailyFortune());

        System.out.println(coach3.dailyWorkout());
        System.out.println(coach3.getDailyFortune());
        System.out.println(coach3.getEmailAddress());
        System.out.println(coach3.getTeam());

        //close the context
        applicationContext.close();
    }
}

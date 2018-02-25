package com.mlcode.test.demo1;

import com.mlcode.demo1.Coach;
import com.mlcode.demo1.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach footballCoach = applicationContext.getBean("footballCoach", Coach.class);

        System.out.println("Football Coach");
        System.out.println(footballCoach.dailyWorkout());
        System.out.println(footballCoach.getDailyFortune());

        CricketCoach cricketCoach = applicationContext.getBean("cricketCoach", CricketCoach.class);
        System.out.println("Cricket Coach");
        System.out.println(cricketCoach.dailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeam());

        System.out.println("Track Coach");
        Coach trackCoach = applicationContext.getBean("trackCoach", Coach.class);
        System.out.println(trackCoach.dailyWorkout());
        System.out.println(trackCoach.getDailyFortune());

        applicationContext.close();
    }
}

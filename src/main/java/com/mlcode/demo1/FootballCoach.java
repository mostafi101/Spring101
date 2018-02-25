package com.mlcode.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    //define a private field for dependency
    private FortuneService fortuneService;

    public FootballCoach() {

    }
//define a constructor for dependency injection
    @Autowired
    FootballCoach(@Qualifier("happyFortuneService") FortuneService fortuneService){
        System.out.println("Football Coach has been created");
        this.fortuneService = fortuneService;
    }

    public String dailyWorkout() {
        return "Practice for 90 min";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

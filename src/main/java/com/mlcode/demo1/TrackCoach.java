package com.mlcode.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("trackCoach")
public class TrackCoach implements Coach {

    //define a private filed for dependency
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TrackCoach() {
    }

    //define a constructor for dependency injection

    public String dailyWorkout() {
        return "Run a hard 5k";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void doMyStartupStaff() {
        System.out.println("TrackCoach startup");
    }

    public void doMyCleanUpStuff() {
        System.out.println("TrackCoach clean up");
    }
}

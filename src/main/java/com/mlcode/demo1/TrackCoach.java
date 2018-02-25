package com.mlcode.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

    @PostConstruct
    public void doMyStartupStaff() {
        System.out.println("TrackCoach startup");
    }

    @PreDestroy
    public void doMyCleanUpStuff() {
        System.out.println("TrackCoach clean up");
    }
}

package com.mlcode.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Value("${foo.emailAddress}")
    private String emailAddress;

    @Value("${foo.team}")
    private String team;

    //define a private field for the dependency
    private FortuneService fortuneService;

    public CricketCoach() {
    }
    //define a setter method for dependency injection
    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String dailyWorkout() {
        return "Worked out for batting 30 min and bowling around 1 hour";
    }

    public String getDailyFortune() {

        //use my fortuneservice to get fortune
        return fortuneService.getFortune();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
    
}

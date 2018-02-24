package com.mlcode.demo1;

public class CricketCoach implements Coach {

    //define a private field for the dependency
    private FortuneService fortuneService;

    public CricketCoach() {
    }
    //define a setter method for dependency injection
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String dailyWorkout() {
        return "Worked out for batting 30 min and bowling around 1 hour";
    }

    public String getDailyFortune() {

        //use my fortuneservice to get fortune
        return fortuneService.getFortune();
    }
}

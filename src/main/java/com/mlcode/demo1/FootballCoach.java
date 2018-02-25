package com.mlcode.demo1;

public class FootballCoach implements Coach {

    //define a private field for dependency
    private FortuneService fortuneService;

    public FootballCoach() {

    }
//define a constructor for dependency injection

    FootballCoach(FortuneService fortuneService){
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

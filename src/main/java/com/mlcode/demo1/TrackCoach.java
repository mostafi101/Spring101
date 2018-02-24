package com.mlcode.demo1;

public class TrackCoach implements Coach {

    //define a private filed for dependency
    private FortuneService fortuneService;

    public TrackCoach() {
    }

    //define a constructor for dependency injection
    TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String dailyWorkout() {
        return "Run a hard 5k";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

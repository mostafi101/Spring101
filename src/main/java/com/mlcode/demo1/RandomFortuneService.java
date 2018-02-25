package com.mlcode.demo1;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private String[] data = {
            "This is a lucky day",
            "Luckiest day of my life",
            "WOW!! What a day"
    };

    private Random random = new Random();

    public String getFortune() {
        int index = random.nextInt(data.length);
        System.out.println(index);
        return data[index];
    }
}

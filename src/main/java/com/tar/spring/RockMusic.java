package com.tar.spring;

public class RockMusic implements Music {

    private RockMusic() {
    }

    public static RockMusic getRockMusic() {
        return new RockMusic();
    }

    //doMyInit doDestroy should not have any args
    public void doMyInit() {
        System.out.println("do init");
    }

    public void doDestroy() {
        System.out.println("do destraction");
    }

    @Override
    public String getSong() {
        return "We wil rock you";
    }
}

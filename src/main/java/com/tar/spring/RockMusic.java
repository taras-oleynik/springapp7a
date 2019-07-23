package com.tar.spring;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {


    @Override
    public String getSong() {
        return "We wil rock you";
    }
}

package com.tar.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Bethovin");
        songs.add("Mozart");
        songs.add("Cone partiro");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}

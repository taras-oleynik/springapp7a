package com.tar.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("We wil rock you");
        songs.add("Yestarday");
        songs.add("Imagen");
    }

    @Override
    public List<String> getSongs() {

        return songs;

    }

}


package com.tar.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
/*   // @Autowired    via field
    private Music music;


    // @Autowired    constrictor
    public MusicPlayer(Music music) {
        this.music = music;
    }


    //@Autowired   via setter
    public void setMusicPlayer(Music music) {

        this.music = music;

    }*/

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic() {
        return "Now playing: " + classicalMusic.getSong();



    }
}

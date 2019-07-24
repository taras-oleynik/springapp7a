package com.tar.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    /*  @Autowired
      @Qualifier("classicalMusic")*/
   /* private Music music1;
    private Music music2;*/

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

   /* @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }*/


    public void playMusic(MusicGenre musicGenre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (musicGenre == MusicGenre.ROCK) {
            System.out.println(rockMusic.getSongs().get(randomNumber));

        } else {
            classicalMusic.getSongs().get(randomNumber);
        }
        //return "Now playing: " + music1.getSong() + ", " + music2.getSong();


    }
}

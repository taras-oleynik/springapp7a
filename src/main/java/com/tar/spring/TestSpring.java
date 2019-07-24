package com.tar.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        //this class from depandancy it looks to xml file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(

                "applicationContext.xml");

       /* MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();*/

     /*  Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);*/

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(MusicGenre.CLASSICAL);
        musicPlayer.playMusic(MusicGenre.ROCK);
        context.close();
    }
}

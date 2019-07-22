package com.tar.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        //this class from depandancy it looks to xml file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(

                "applicationContext.xml");

        RockMusic rockMusic = context.getBean("musicBean", RockMusic.class);
        System.out.println(rockMusic.getSong());


        //bean id="testBean" and class obj we want to receive
        //Music music = context.getBean("musicBean", Music.class); we made this bean in XML
        //inject dependancy
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        //Get from context Constructors injections
       /* MusicPlayer firstMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);*/
        // MusicPlayer musicPlayer= context.getBean("musicPlayer",MusicPlayer.class);
        //musicPlayer.playMusic();

        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getVolume());
        //close app after the finish
// by default single tone that's why it trigers the same object, if scope="prototype"
       /* boolean compare = firstMusicPlayer== secondMusicPlayer;
        firstMusicPlayer.setVolume(45);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
        System.out.println(compare);*/
        context.close();
    }
}

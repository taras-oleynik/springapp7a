package com.tar.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        //this class from depandancy it looks to xml file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(

                "applicationContext.xml");
        //bean id="testBean" and class obj we want to receive
        Music music = context.getBean("musicBean", Music.class);
        //inject dependancy
        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();
        //close app after the finish
        context.close();
    }
}

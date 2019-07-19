package com.tar.spring;
// inversial control class
public class MusicPlayer {
    private Music music;
//polimorphism here Ioc
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void playMusic(){
        System.out.println("Now playing: "+ music.getSong());
    }
}

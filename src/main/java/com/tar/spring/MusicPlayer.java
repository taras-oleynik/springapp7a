package com.tar.spring;

import java.util.ArrayList;
import java.util.List;

// inversial control class
public class MusicPlayer {
    // private Music music;
    private String name;
    private int volume;
    private List<Music> musicList = new ArrayList<>();

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer() {
    }


    //polimorphism here Ioc constracter dependenciy
  /*  public MusicPlayer(Music music) {
        this.music = music;
    }*/


//spring gets this method by converting setMusic into music
   /* public void setMusic(Music music) {
        this.music = music;
    }*/

    public void playMusic() {
        for (int i = 0; i < musicList.size(); i++) {
            System.out.println("Now playing: " + musicList.get(i).getSong());
        }

    }
}

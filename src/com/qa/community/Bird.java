package com.qa.community;

public class Bird extends Animal {

    private String song;

    @Override
    public String speak() {
        return "tweet tweet";
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

}

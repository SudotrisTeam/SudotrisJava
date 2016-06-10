package com.heroku.demo;

/**
 * Created by Kepa on 10/06/2016.
 */
public class Score {
    public String getName() {
        return name;
    }

    public Score(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    String name;
    int time;
}

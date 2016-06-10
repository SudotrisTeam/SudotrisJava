package com.heroku.demo;

/**
 * Created by Kepa on 10/06/2016.
 */
public class Score {
    public String getName() {
        return name;
    }

    public Score(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    String name;
    String time;
}

package com.example.spacetrader;

public class Game {

    public Difficulty difficulty;

    public Game(Difficulty diff){
        difficulty = diff;
    }

    public void setDifficulty(Difficulty diff) { difficulty = diff;}

    public Difficulty getDifficulty() {
        return difficulty;
    }
}

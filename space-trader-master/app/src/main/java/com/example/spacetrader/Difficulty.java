package com.example.spacetrader;

public enum Difficulty {

    BEGINNER("BEGINNER"),
    EASY("EASY"),
    NORMAL("NORMAL"),
    HARD("HARD"),
    IMPOSSIBLE("IMPOSSIBLE");

    private final String level;

    Difficulty(String lev) {
        level = lev;
    }

    public String toString() {return level;}

}

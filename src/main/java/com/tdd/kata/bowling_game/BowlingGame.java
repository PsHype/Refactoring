package com.tdd.kata.bowling_game;

public class BowlingGame {
    private int score;

    public void roll(int pins) {
        score += pins;
    }

    public int score() {
        return score;
    }
}

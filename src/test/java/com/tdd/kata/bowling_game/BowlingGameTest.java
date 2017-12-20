package com.tdd.kata.bowling_game;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class BowlingGameTest {

    private BowlingGame g;

    @Before
    public void setUp() {
        g = new BowlingGame();
    }

    @Test
    public void test_gutter_game() {
        rollMany(20, 0);
        assertSame(0, g.score());
    }

    @Test
    public void test_all_ones() {
        rollMany(20, 1);
        assertEquals(20, g.score());
    }

    @Test
    @Ignore
    public void test_one_spare() {
        g.roll(5);
        g.roll(5);
        g.roll(3);
        rollMany(17,0);

        assertEquals(16, g.score());
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            g.roll(pins);
        }
    }

}
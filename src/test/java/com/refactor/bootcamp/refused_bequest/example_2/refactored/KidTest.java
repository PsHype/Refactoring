package com.refactor.bootcamp.refused_bequest.example_2.refactored;

import org.junit.Test;

import static org.junit.Assert.*;

public class KidTest {

    @Test
    public void should_return_kid_name() throws Exception {
        Kid kid = new Kid("Jay");
        assertEquals("Jay", kid.getName());
    }
}
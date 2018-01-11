package com.refactor.bootcamp.middle_man.example_2;

import org.junit.Assert;
import org.junit.Test;

public class MiddleManExample2Test {
    @Test
    public void should_rating_right() {
        Assert.assertEquals(new MiddleManExample2(5).getRating(), MiddleManExample2.LEVEL_2);
        Assert.assertEquals(new MiddleManExample2(4).getRating(), MiddleManExample2.LEVEL_1);
    }
}
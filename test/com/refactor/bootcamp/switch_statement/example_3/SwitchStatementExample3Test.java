package com.refactor.bootcamp.switch_statement.example_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwitchStatementExample3Test {
    @Test
    public void should_set_value_ok() throws Exception {
        SwitchStatementExample3 cube = new SwitchStatementExample3();
        cube.setValue("length", 1);
        cube.setValue("height", 2);
        cube.setValue("width", 3);
        assertEquals(1, cube.length);
        assertEquals(2, cube.height);
        assertEquals(3, cube.width);
    }
}
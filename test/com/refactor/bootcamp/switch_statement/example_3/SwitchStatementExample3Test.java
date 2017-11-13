package com.refactor.bootcamp.switch_statement.example_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwitchStatementExample3Test {
    @Test
    public void should_set_value_ok() throws Exception {
        SwitchStatementExample3 cube = new SwitchStatementExample3();
        cube.setLength(1);
        cube.setHeight(2);
        cube.setWidth(3);

        assertEquals(1, cube.length);
        assertEquals(2, cube.height);
        assertEquals(3, cube.width);
    }
}
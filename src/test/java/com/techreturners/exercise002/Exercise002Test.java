package com.techreturners.exercise002;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise002Test {

    @Test
    public void checkPast() {
        Exercise002 ex002 = new Exercise002();
        assertEquals(61000, ex002.past(0,1,1));
        assertEquals(3661000, ex002.past(1,1,1));
        assertEquals(0, ex002.past(0, 0, 0));
        assertEquals(3601000, ex002.past(1, 0, 1));
        assertEquals(3600000, ex002.past(1, 0, 0));
    }
}

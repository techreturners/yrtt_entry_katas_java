package com.techreturners.exercise002;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise002Test {

    @Test
    public void checkRepeats() {
        Exercise001 ex002 = new Exercise002();
        assertEquals(15, ex002.past(new int[] { 4, 5, 7, 5, 4, 8 }));
        assertEquals(19, ex002.past(new int[] { 9, 10, 19, 13, 19, 13 }));
        assertEquals(12, ex002.past(new int[] { 16, 0, 11, 4, 8, 16, 0, 11 }));
    }
}

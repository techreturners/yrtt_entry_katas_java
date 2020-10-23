package com.techreturners.exercise003;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise003Test {

    @Test
    public void rowWeights() {
        Exercise003 ex003 = new Exercise003();
        assertArrayEquals(new int[]{80,0}, ex003.rowWeights(new int[]{80}));
        assertArrayEquals(new int[]{100,50}, ex003.rowWeights(new int[]{100,50}));
        assertArrayEquals(new int[]{120,140}, ex003.rowWeights(new int[]{50,60,70,80}));

        assertArrayEquals(new int[]{62,27}, ex003.rowWeights(new int[]{13,27,49}));
        assertArrayEquals(new int[]{236,92}, ex003.rowWeights(new int[]{70,58,75,34,91}));
        assertArrayEquals(new int[]{211,164}, ex003.rowWeights(new int[]{29,83,67,53,19,28,96}));

        assertArrayEquals(new int[]{100,50}, ex003.rowWeights(new int[]{100,50}));
        assertArrayEquals(new int[]{150,151}, ex003.rowWeights(new int[]{100,51,50,100}));
        assertArrayEquals(new int[]{207,235}, ex003.rowWeights(new int[]{39,84,74,18,59,72,35,61}));
    }
}

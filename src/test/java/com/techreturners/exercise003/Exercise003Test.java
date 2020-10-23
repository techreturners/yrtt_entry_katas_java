package com.techreturners.exercise003;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Exercise003Test {

    @Test
    public void rowWeights() {
        assertArrayEquals(new int[]{80,0}, Exercise003.rowWeights(new int[]{80}));
        assertArrayEquals(new int[]{100,50}, Exercise003.rowWeights(new int[]{100,50}));
        assertArrayEquals(new int[]{120,140}, Exercise003.rowWeights(new int[]{50,60,70,80}));

        assertArrayEquals(new int[]{62,27}, Exercise003.rowWeights(new int[]{13,27,49}));
        assertArrayEquals(new int[]{236,92}, Exercise003.rowWeights(new int[]{70,58,75,34,91}));
        assertArrayEquals(new int[]{211,164}, Exercise003.rowWeights(new int[]{29,83,67,53,19,28,96}));

        assertArrayEquals(new int[]{100,50}, Exercise003.rowWeights(new int[]{100,50}));
        assertArrayEquals(new int[]{150,151}, Exercise003.rowWeights(new int[]{100,51,50,100}));
        assertArrayEquals(new int[]{207,235}, Exercise003.rowWeights(new int[]{39,84,74,18,59,72,35,61}));
    }
}

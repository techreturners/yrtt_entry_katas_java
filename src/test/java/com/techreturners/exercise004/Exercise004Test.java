package com.techreturners.exercise004;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise004Test {
        @Test
        public void checkPigLatin() {
            Exercise004 ex004 = new Exercise004();
            assertEquals("igPay atinlay siay oolcay", ex004.pigLatin("Pig latin is cool"));
            assertEquals("hisTay siay ymay tringsay", ex004.pigLatin("This is my string"));
            assertEquals("odingCay siay unfay!", ex004.pigLatin("Coding is fun!"));
    }
}

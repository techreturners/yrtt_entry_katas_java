package com.techreturners.exercise005;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class Exercise005Test {
        @Test
        public void checkMexicanWave() {
            Exercise005 ex005 = new Exercise005();
            
            String[] result = new String[] { "Hello", "hEllo", "heLlo", "helLo", "hellO" };
            assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, ex005.mexicanWave("hello"));

            String[] result2 = new String[] { "Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs", "codewaRs", "codewarS" };
            assertArrayEquals("it should return '" + Arrays.toString(result2) + "'", result2, ex005.mexicanWave("codewars"));

            String[] result3 = new String[] { };
            assertArrayEquals("it should return '" + Arrays.toString(result3) + "'", result3, ex005.mexicanWave(""));


            String[] result4 = new String[] { "Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS" };
            assertArrayEquals("it should return '" + Arrays.toString(result4) + "'", result4, ex005.mexicanWave("two words"));

            
            String[] result5 = new String[] { " Gap ", " gAp ", " gaP " };
            assertArrayEquals("it should return '" + Arrays.toString(result5) + "'", result5, ex005.mexicanWave(" gap "));
    }
}
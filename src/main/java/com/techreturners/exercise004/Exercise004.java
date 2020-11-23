package com.techreturners.exercise004;

public class Exercise004 {

     // Move the first letter of each word to the end of it, then add "ay" to the end of the word. 
    // Leave punctuation marks untouched.

    public String pigLatin(String str) {
        StringBuffer s2 = new StringBuffer();
        char[] input = str.toCharArray();
        char c = ' ';
        for (int i = 0; i < input.length; i++) {
            if (i == 0) {
                c = input[i];
            } else {
                s2.append(input[i]);
            }
        }
        s2.append(c);
        s2.append("ay");
        return "" + s2;
       
    }
}

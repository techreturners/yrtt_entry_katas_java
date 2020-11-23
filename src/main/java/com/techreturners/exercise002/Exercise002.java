package com.techreturners.exercise002;

public class Exercise002 {

    // The clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
    // Your task is to make the 'past' function return time past midnight converted to milliseconds.
    final static int SEC_IN_MIN = 60; 	
    final static int SEC_IN_HOUR = SEC_IN_MIN * 60;
   
    public int past(int h, int m, int s) {
        
        int secFromMidnight = (h * SEC_IN_HOUR + m * SEC_IN_MIN + s) * 1000;
        return secFromMidnight;
        
        
    }
}

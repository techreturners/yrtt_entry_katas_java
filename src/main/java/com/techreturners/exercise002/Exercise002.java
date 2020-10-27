package com.techreturners.exercise002;

public class Exercise002 {

    // The clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
    // Your task is to make the 'past' function return time past midnight converted to milliseconds.

    public int past(int h, int m, int s) {
        // Your code here!
    	int  midnight, current;
    	
    	midnight = 23*3600 + 59*60 + 59;
    	
    	current = Math.abs(h)*3600 + Math.abs(m)*60 + Math.abs(s);
    	
    	if (current > midnight)
    		current %= midnight;
    	
        return current * 1000;
    }
}

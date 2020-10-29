package com.techreturners.exercise004;

public class Exercise004 {

     // Move the first letter of each word to the end of it, then add "ay" to the end of the word. 
    // Leave punctuation marks untouched.

    public String pigLatin(String str) {
        // Add your code here
    	String ans="", word="";
    	char[] inArray = str.toCharArray();
    	
    	for(int i=0; i<inArray.length ; i++) {
    		
    		if(Character.isLetter(inArray[i]))
    			word += inArray[i];
    		
    		if((word.length()>0) &&
    		   (!Character.isLetter(inArray[i]) || i==(inArray.length-1)) ) {
    			
    			word = word.substring(1) + word.CharAt(0) + "ay";
    			
    			if (!Character.isLetter(inArray[i]))
    				word += inArray[i];
    			
    			ans += word;
    			word = "";
    		}
    	} 
	    
        return ans;
	    
    }
}

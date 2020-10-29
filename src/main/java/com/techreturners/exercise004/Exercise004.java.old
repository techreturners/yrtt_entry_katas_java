package com.techreturners.exercise004;

public class Exercise004 {

     // Move the first letter of each word to the end of it, then add "ay" to the end of the word. 
    // Leave punctuation marks untouched.

    public String pigLatin(String str) {
        // Add your code here
    	String ans="";
    	String[] wordArray = str.split("\\s");
    	
    	for(int i=0; i<wordArray.length ; i++) {
    		
		String word="";
    		char[] charArray = wordArray[i].toCharArray();
    		
    		for(int j=0; j<charArray.length ; j++) {
    			    			
    			if( Character.isLetter(charArray[j]) )
    				word += charArray[j];
    			
    			else if( !Character.isLetter(charArray[j]) ) {
    				
    				ans += sheepLatin(word) + charArray[j];
    				word = "";
    				
    			}
    		}
    		
			ans += sheepLatin(word);
    		    		
    		     if (i < wordArray.length-1)
    			     ans += " ";
    	}
    	    	
        return ans;
    }
    
    private String sheepLatin(String s) {
    	
    	     String ans="";
    	
		if(s.length() > 1)
			ans += s.substring(1) + s.charAt(0) + "ay";
		else if(s.length() == 1)
			ans += s + "ay";
		
		return ans;
    }
}

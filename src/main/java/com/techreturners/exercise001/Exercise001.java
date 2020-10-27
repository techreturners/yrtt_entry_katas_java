package com.techreturners.exercise001;

public class Exercise001 {

    // In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. 
    // Your task will be to return the sum of the numbers that occur only once.
    // For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15.

    // More examples in exercise001 test cases.

    // Good luck!

    public int singles(int [] arr){
        // Add your code here!
	int[] err=arr;
        int ans=0;

        for (int i=0; i<arr.length ; i++) {

            boolean duplicate = false;

            for (int j=0; j<err.length ; j++) {

                if ( i!=j && arr[i]==err[j]){

                    duplicate = true;
                    break;

                }
							
            }

            if (!duplicate)
                    ans += arr[i];
        }
        return ans;
    }
}

package com.techreturners.exercise001;

public class Exercise001 {

    // In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. 
    // Your task will be to return the sum of the numbers that occur only once.
    // For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15.

    // More examples in exercise001 test cases.

    // Good luck!

    public int singles(int [] arr){
       Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

		if (arr.length == 0)
			return -1;

		for (int i = 0; i < arr.length; i++) {
			if (freqMap.containsKey(arr[i])) {
				int value = freqMap.get(arr[i]);
				value = value + 1;
				freqMap.put(arr[i], value);
			} else {
				freqMap.put(arr[i], 1);
			}
		}
		int sum = 0;
		for (Entry<Integer, Integer> entry : freqMap.entrySet()) {
			if (entry.getValue() == 1) {
				sum = sum + entry.getKey();
			}
		}

		return sum;
        
    }
}

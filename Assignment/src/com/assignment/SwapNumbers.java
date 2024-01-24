package com.assignment;

public class SwapNumbers {

	public static void swapNumber(int first,int second) {
		System.out.println("Before Swapping : First="+first+",Second="+second);
		first=first+second;
		second=first-second;
		first=first-second;
		System.out.println("After Swapping:First="+first+",Second="+second);
	}

}

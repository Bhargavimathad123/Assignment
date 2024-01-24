package com.assignment;
import java.util.Scanner;
public class Smain {


	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int first=sc.nextInt();
		
		System.out.println("Enter the second number");
		int second=sc.nextInt();
		
		SwapNumbers.swapNumber(first,second);
		sc.close();
		
	}

}
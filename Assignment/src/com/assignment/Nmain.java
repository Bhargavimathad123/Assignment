package com.assignment;
import java.util.Scanner;
public class Nmain {



	public static void main(String srgs[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int n1=sc.nextInt();
		
		System.out.println("Enter the second number");
		int n2=sc.nextInt();
		
		System.out.println("Enter the third number");
		int n3=sc.nextInt();
		
		Game.findSmallest(n1, n2, n3);
		sc.close();
		
	}

}

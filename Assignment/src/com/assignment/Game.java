package com.assignment;
public class Game {
	public static void findSmallest(int n1,int n2,int n3) {
		int smallest=(n1<n2)?(n1<n3 ? n1:n3):(n2<n3 ?n2:n3);
		if(n1==n2 && n2==n3) {
			System.out.println("All numbers are equal");
		}
		else {
			System.out.println("The smallest number is:" +smallest);
		}
	}

}


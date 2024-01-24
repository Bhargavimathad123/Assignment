package com.assignment;

import java.util.Scanner;


	public class Main{
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter name");
			String name=sc.nextLine();
			
			System.out.println("Enter source");
			String source=sc.nextLine();
			
			System.out.println("Enter destination");
			String destination=sc.nextLine();
			
			Airways cs=new Airways(name,source,destination);
			System.out.println("dear "+name+" ,welcome onboard with service from "+source+" to "+destination+" .Thank you for choosing SkyAirlines.Enjoy your flight");
			sc.close();
		}
	}



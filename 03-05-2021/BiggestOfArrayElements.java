package com.ojas.mar5;

import java.util.Scanner;

public class BiggestOfArrayElements {
	 static int biggestNumber(int num[]) {
		   int big = num[0];
		   for ( int i = 1; i < num.length; i++) {
			   if (num[i] > big) 
				   big = num[i];
		     } 
	 
		  return big;
	}
	public static void main(String[] args) {
		int num[] = new int[5];
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the numbers");
		for(int i = 0; i < num.length; i++) {
			 num[i]  = sc.nextInt();
			 
		}
		System.out.println("Biggest value = "+(biggestNumber(num)));
		
	}

}

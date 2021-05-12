package com.ojas.mar5;

import java.util.Scanner;

public class SumOfNaturalNumberRecursion {
	static int sumOfNaturalNumber(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n+sumOfNaturalNumber(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element n:");
		int n = sc.nextInt();
		System.out.println(sumOfNaturalNumber(n));

	}

}

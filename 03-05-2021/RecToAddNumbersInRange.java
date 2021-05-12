package com.ojas.mar5;

import java.util.Scanner;

public class RecToAddNumbersInRange {
	static int recToAddNumbers(int n) {
		if(n == 10) {
			return 10;
		}
		else {
		      return n+recToAddNumbers(++n);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element n:");
		int n = sc.nextInt();
		System.out.println(recToAddNumbers(n));

	}

}

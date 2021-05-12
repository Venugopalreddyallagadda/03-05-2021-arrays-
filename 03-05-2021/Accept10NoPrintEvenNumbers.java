package com.ojas.mar5;

import java.util.Scanner;

public class Accept10NoPrintEvenNumbers {

	static String printEvenNumbers(int num[]) {
		String res = "";
		for (int i = 0; i <= num.length-1; i++) {
			if (num[i] % 2 == 0) {
				res += " "+num[i];
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("Even numbers:" + printEvenNumbers(num));
	}

}

package com.ojas.mar5;

public class LCMOfInteger {

	public static void main(String[] args) {
		int gcd =1;
		int lcm = 1;
		int num1 = 5;
		int num2 = 10;
		for (int i = 1; i <= 5 && i <= 10; i++) {
			
			if (num1%i== 0 && num2%i == 0) 
				gcd = i;		
		}
		System.out.printf("GCD of %d and %d is: %d",num1, num2, gcd);
		System.out.println();
		lcm = (num1*num2)/gcd;
		System.out.printf("LCM of %d and %d is: %d",num1, num2,lcm);	
	}
}

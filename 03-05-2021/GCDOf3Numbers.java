package com.ojas.mar5;

public class GCDOf3Numbers {

	public static void main(String[] args) {
		int gcd =1;
		int num1 = 11;
		int num2 = 10;
		int num3 = 15;
		for (int i = 1; i <= num1 && i <= num2 && i<=num3; i++) {
			
			if (num1%i== 0 && num2%i == 0 && num3%i ==0) 
				gcd = i;		
		}
			
			System.out.printf("GCD of %d and %d and %d is: %d",num1, num2, num3,gcd);
			
		}

	}


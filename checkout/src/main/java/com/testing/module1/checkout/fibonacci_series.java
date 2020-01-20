package com.testing.module1.checkout;

import java.text.BreakIterator;
import java.util.Scanner;

public class fibonacci_series {
	static int sum = 0;
	static int count = 1;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a, b,n, sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many elements you want in a series");
		n=scanner.nextInt();
		System.out.println("Enter the first number");
		a = scanner.nextInt();

		System.out.println("Enter the second number");
		b = scanner.nextInt();
		
		 while (count != (n - 1)) {
			sum = a + b;
			System.out.println("The" + (count + 2) + " element of the series is " + sum);
			count++;
			
			a=b;
			b=sum;
			
		}

	}

}

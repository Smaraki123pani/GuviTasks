
//Q.4) Write a java program to find the smallest number among the three numbers.

package com.demo.task.one;

import java.util.Scanner;

public class TashFour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int smallest = findSmallest(num1, num2, num3);

		System.out.println("The smallest number is: " + smallest);
	}

	public static int findSmallest(int num1, int num2, int num3) {
		int smallest = num1;
		if (num2 < smallest) {
			smallest = num2;
		}
		if (num3 < smallest) {
			smallest = num3;
		}
		return smallest;
	}
}

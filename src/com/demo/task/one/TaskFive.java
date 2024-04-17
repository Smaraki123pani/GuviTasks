
//Q.5) Write a java program that takes the purchase amount as input and calculates the final payable amount after applying the discount.
      //i) If the purchase amount is less than 500, no discount is applied.
      //ii) If the purchase amount is between 500 to 1000, a 10% discount is applied.
      //iii) If the purchase amount is greater than 1000, a 20% discount is applied.

package com.demo.task.one;

import java.util.Scanner;

public class TaskFive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("The Purchase Amount:");
		double amount = sc.nextDouble();

		if (amount < 500) {
			System.out.println("No Discount Applied:" + (amount));
			
		} else if (amount >= 500 && amount <= 1000) {
			System.out.println("10% Discount Applied:" + (amount/100)*10);
			
		} else if (amount > 1000) {
			System.out.println("20% Discount Applied:" + (amount/100)*20);
		}
	}
}

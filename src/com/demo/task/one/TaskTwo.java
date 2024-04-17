
//Q.2) Write a program that find a given number is Negative/Positive.

package com.demo.task.one;

import java.util.Scanner;

public class TaskTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int a = sc.nextInt();

		if (a > 0) {
			System.out.println("Positive");
		} else if (a < 0) {
			System.out.println("Negative");

		}
	}
}
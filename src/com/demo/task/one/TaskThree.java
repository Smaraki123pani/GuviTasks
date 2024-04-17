
//Q.3) Write down the program to reverse the given number using loops.
      //Input-876 
      //Output-678

package com.demo.task.one;

public class TaskThree {
	public static void main(String[] args) {

		int number = 876;
		int reversedNumber = reverse(number);
		System.out.println("Input: " + number);
		System.out.println("Output: " + reversedNumber);
	}

	public static int reverse(int number) {
		int reversedNumber = 0;
		while (number != 0) {
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			number /= 10;
		}
		return reversedNumber;
	}

}

//Q.6) Write a java program to print bellowed pattern -> i and j and k=>5
       //55555
       //54444
       //54333
       //54322
       //54321

package com.demo.task.one;

public class TaskSix {
	public static void main(String[] args) {

		int n = 5;
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= 1; j--) {
				if (j > i)
					System.out.print(j);
				else
					System.out.print(i);
			}
			System.out.println();
		}

	}

}

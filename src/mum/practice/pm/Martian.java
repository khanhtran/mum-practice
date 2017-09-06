package mum.practice.pm;

import mum.practice.Solution;

/**
 * Define an array to be a Martian array if the number of 1s is greater than the
 * number of 2s and no two adjacent elements are equal. Write a function named
 * isMartian that returns 1 if its argument is a Martian array; otherwise it
 * returns 0. If you are programming in Java or C#, the function signature is
 * int isMartian(int[ ] a) If you are programming in C or C++, the function
 * signature is int isMartian(int a[ ], int len) where len is the number of
 * elements in the array a. There are two additional requirements. 1. You should
 * return 0 as soon as it is known that the array is not a Martian array;
 * continuing to analyze the array would be a waste of CPU cycles. 2. There
 * should be exactly one loop in your solution.
 * 
 * @author Khanh
 *
 */
public class Martian extends Solution {

	public Martian() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void solve2() {
		// TODO Auto-generated method stub
		super.solve2();
		output = isMartian(new int[] { 1, 2, 1, 2, 1, 2, 1, 2, 1 });
		printResult();
	}

	private Object isMartian(int[] a) {
		int i = 0, j = 1;
		int c1 = 0, c2 = 0;
		for (; i < a.length - 1; i++, j++) {
			if (a[i] == a[j]) {
				return 0;
			}
			if (a[i] == 1) {
				c1++;
			} else if (a[i] == 2) {
				c2++;
			}
		}
		if (a[i] == 1) {
			c1++;
		} else if (a[i] == 2) {
			c2++;
		}
		if (c1 > c2) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		new Martian().solve2();
	}

}

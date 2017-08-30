package mum.practice.pk;

import mum.practice.Solution;

/**
 * Define an array to be one-balanced if begins with zero or more 1s followed by
 * zero or more non-1s and concludes with zero or more 1s. Write a function
 * named isOneBalanced that returns 1 if its array argument is one-balanced,
 * otherwise it returns 0. If you are programming in Java or C#, the function
 * signature is int isOneBalanced(int[ ] a) If you are programming in C or C++,
 * the function signature is int isOneBalanced(int a[ ], int len) where len is
 * the number of elements in the array a. Examples if a is then function returns
 * reason {1, 1, 1, 2, 3, -18, 45, 1} 1 because it begins with three 1s,
 * followed by four non-1s and ends with one 1 and 3+1 == 4
 * 
 * @author Khanh
 *
 */
public class OneBalanced extends Solution {

	public OneBalanced() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void solve2() {
		// TODO Auto-generated method stub
		super.solve2();
		output = isOneBalanced(new int[] { 1, 1, 1, 2, 3, -18, 45, 1 });
		printResult();
	}

	private Object isOneBalanced(int[] a) {
		int c1 = 0;
		int cn1 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				c1++;
			} else {
				cn1++;
			}
		}
		if (c1 == cn1) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OneBalanced().solve2();
	}

}

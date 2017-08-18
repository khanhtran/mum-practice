package mum.practice.pd;

import mum.practice.Solution;

/**
 * Write a function named largestAdjacentSum that iterates through an array
 * computing the sum of adjacent elements and returning the largest such sum.
 * You may assume that the array has at least 2 elements. If you are writing in
 * Java or C#, the function signature is int largestAdjacentSum(int[ ] a) If you
 * are writing in C or C++, the function signature is int largestAdjacentSum(int
 * a[ ], int len) where len is the number of elements in a
 * 
 * @author Khanh
 *
 */
public class Adjacent extends Solution {

	public Adjacent() {
		input = "4 1 2 3 4";
	}

	@Override
	public Object solve() {
		super.solve();
		int [] a = readArray();
		output = largestAdjacentSum(a);
		printResult();
		return null;
	}
	
	/**
	 * Calculate max sum ob adjacent pairs, using sliding windows technique 
	 * @param a
	 * @return
	 */
	private Object largestAdjacentSum(int[] a) {
		int l = 0;
		int r = l + 1;
		int idx = -1;
		int prevSum = -1;
		for (; r < a.length; l++, r++) {
			int sum = a[l] + a[r];
			if (idx == -1 || prevSum < sum) {
				prevSum = sum;
				idx = l;
			}
		}
		return a[idx] + a[idx + 1];
	}

	public static void main(String[] args) {
		new Adjacent().solve();
	}

}

package mum.practice.pf;

import mum.practice.Solution;

/**
 * 1. Define the n-based integer rounding of an integer k to be the nearest
 * multiple of n to k. If two multiples of n are equidistant use the greater
 * one. For example the 4-based rounding of 5 is 4 because 5 is closer to 4 than
 * it is to 8, the 5-based rounding of 5 is 5 because 5 is closer to 5 that it
 * is to 10, the 4-based rounding of 6 is 8 because 6 is equidistant from 4 and
 * 8, so the greater one is used, the 13-based rounding of 9 is 13, because 9 is
 * closer to 13 than it is to 0, Write a function named doIntegerBasedRounding
 * that takes an integer array and rounds all its positive elements using
 * n-based integer rounding.
 * 
 * @author Khanh
 *
 */
public class IntegerRounding extends Solution {

	public IntegerRounding() {
		input = "5 1 2 3 4 5";
	}

	@Override
	public Object solve() {
		super.solve();
		int[] a = readArray();
		output = doIntegerBasedRounding(a, 100);
		printResult();
		return null;
	}

	private Object doIntegerBasedRounding(int[] a, int n) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = integerRound(n, a[i]);
		}
		return b;
	}

	/**
	 * do base N rounding on K
	 * @param n
	 * @param k
	 * @return
	 */
	private int integerRound(int n, int k) {
		if (n <= 1 || k < 0 || n == k) {
			return k;
		}
		
		int l, r;
		int result;
		if (n < k) {
			l = k - k % n;
			r = l + n;			
		} else {
			l = 0;
			r = n;
		}
		result = findCloser(l, k, r);
		return result;
	}

	/**
	 * find close one l < k < r
	 * @param l
	 * @param k
	 * @param r
	 * @return
	 */
	private int findCloser(int l, int k, int r) {
		int a = k - l;
		int b = r - k;
		if (a < b) {
			return l;
		} else {
			return r;
		}
	}

	public static void main(String[] args) {
		new IntegerRounding().solve();
	}

}

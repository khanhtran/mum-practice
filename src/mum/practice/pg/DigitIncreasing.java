package mum.practice.pg;

import mum.practice.Solution;

/**
 * 2. A number is called digit-increasing if it is equal to n + nn + nnn + … for
 * some digit n between 1 and 9. For example 24 is digit-increasing because it
 * equals 2 + 22 (here n = 2) Write a function called isDigitIncreasing that
 * returns 1 if its argument is digit-increasing otherwise, it returns 0.
 * 
 * @author Khanh
 *
 */
public class DigitIncreasing extends Solution {

	public DigitIncreasing() {
		input = "";
	}

	@Override
	public Object solve() {
		super.solve();
		output = isDigitIncreasing(24);
		printResult();
		return null;
	}

	private Object isDigitIncreasing(int k) {
		for (int n = 1; n <= 9; n++) {
			if (isDigitIncreasing(k, n) == 1) {
				return 1;
			}
		}
		return 0;
	}
	//	k = n + nn + nnn...
	private int isDigitIncreasing(int k, int n) {
		int m = 1;
		int t = 0;
		do {
			t = t + calNum(m, n);
			m++;
		} while ( t < k);
		return t == k ? 1:0;
	}
	/**
	 * calculate value of mn. m=1,n=7=>7, m=2, n=7=>77
	 * @param m
	 * @param n
	 * @return
	 */
	private int calNum(int m, int n) {
		int v = 0;
		for (int i = 1; i <= m; i++) {
			v = 10*v + n;
		}
		return v;
	}

	public static void main(String[] args) {
		new DigitIncreasing().solve();

	}

}

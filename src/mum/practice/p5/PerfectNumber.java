package mum.practice.p5;

import mum.practice.Solution;

public class PerfectNumber extends Solution {

	public PerfectNumber() {
		input = "2 1 3";
	}
	public Object solve() {
		super.solve();
		int[] a = readArray();
		int i = a[0];
		int j = a[1];
		output = henry(i, j);
		printResult();
		return null;
	}

	private Object henry(int i, int j) {
		int[] perfectNumbers = new int[j + 1];
		perfectNumbers[1] = 6;
		int k = 2;
		int n = 7;
		while (k <= j) {
			while (!isPerfectNumber(n)) {
				n++;
			}
			perfectNumbers[k] = n;
			n++;
			System.out.println(k + " " + n);
			k++;
		}
		
		return perfectNumbers[i] + perfectNumbers[j];
	}
	private boolean isPerfectNumber(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum == n;
	}
	public static void main(String[] args) {
		new PerfectNumber().solve();
	}
}

package mum.practice.p5;

import mum.practice.Solution;

public class Divisible extends Solution {

	public Divisible() {
		input = "4 3 3 6 36";
	}

	public Object solve() {
		super.solve();
		int[] a = readArray();
		output = isDivisible(a, 3);
		printResult();
		return null;
	}

	private Object isDivisible(int[] a, int n) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % n == 1) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		new Divisible().solve();
	}

}

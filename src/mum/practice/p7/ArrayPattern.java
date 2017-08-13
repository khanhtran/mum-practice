package mum.practice.p7;

import mum.practice.Solution;

public class ArrayPattern extends Solution {

	public ArrayPattern() {
		input = "";
	}

	@Override
	public Object solve() {
		super.solve();
		output = match(new int[] { 1, 2, 3, -5, -5, 2, 3, 18}, new int[] { 3, -2, 3 });
		printResult();
		return null;
	}

	private Object match(int[] A, int[] P) {
		int posA = 0;
		for (int i = 0; i < P.length; i++) {
			int d = P[i];
			int l = check(A, posA, d);
			if (l <= 0) {
				return 0;
			}
			posA += l;
		}
		if (posA >= A.length) {
			return 1;
		}
		return 0;
	}

	private int check(int[] a, int posA, int d) {
		int length = 0;
		int sum = 0;
		while (length < Math.abs(d)) {
			if (d < 0) {
				if (a[posA] > 0) {
					return 0;
				}
			} else if (d > 0) {
				if (a[posA] < 0) {
					return 0;
				}
			}
			sum+= a[posA];
			length++;
			posA++;
		}
		return length;
	}

	public static void main(String[] args) {
		new ArrayPattern().solve();

	}

}

package mum.practice.p6;

import mum.practice.Solution;

public class LegalNumber extends Solution {

	public LegalNumber() {
		input = "3 3 6 1";
	}
	
	@Override
	public Object solve() {
		super.solve();
		int[] a = readArray();
		output = isLegalNumber(a, 6);
		printResult();
		return null;
	}
	
	private Object isLegalNumber(int[] a, int n) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0 || a[i] >= n) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		new LegalNumber().solve();
	}

}

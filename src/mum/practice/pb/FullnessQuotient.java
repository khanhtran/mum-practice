package mum.practice.pb;

import mum.practice.Solution;

public class FullnessQuotient extends Solution {

	public FullnessQuotient() {
		input = "";
	}
	
	@Override
	public Object solve() {
		super.solve();
		output = fullnessQuotient(94);
		printResult();
		return null;
	}

	private Object fullnessQuotient(int n) {
		int count = 0;
		for (int b = 2; b <= 9; b++) {
			if (isNonzeroRep(n, b)) {
				count++;
			}
		}
		return count;
	}

	private boolean isNonzeroRep(int n, int b) {
		do {
			int d = n%b;
			if (d == 0) {
				return false;
			}
			n = n/b;
		} while (n > 0);
		return true;
	}

	public static void main(String[] args) {
		new FullnessQuotient().solve();
	}

}

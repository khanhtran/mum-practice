package mum.practice.pg;

import mum.practice.Solution;

public class ZeroPlentiful extends Solution {

	public ZeroPlentiful() {
//		input = "17 0 0 0 0 0 1 0 0 0 0 8 0 0 0 0 0 0";
		input = "1 0";
	}
	@Override
	public Object solve() {
		super.solve();
		int[] a = readArray();
		output = isZeroPlentiful(a);
		printResult();
		return null;
	}
	
	private Object isZeroPlentiful(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length;) {
			if (a[i] == 0) {
				int j = i+1;
				while (j < a.length && a[j] == 0) {
					j++;
				}
				if (j - i >= 4) {
					count++;
				}
				i = j + 1;
			} else {
				i++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		new ZeroPlentiful().solve();
	}

}

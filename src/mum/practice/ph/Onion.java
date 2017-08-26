package mum.practice.ph;

import mum.practice.Solution;

public class Onion extends Solution {

	public Onion() {
		input = "5 1 2 19 4 5";
	}

	@Override
	public Object solve() {
		super.solve();
		int[] a = readArray();
		output = isOnionArray(a);
		printResult();
		return null;
	}
	
	private Object isOnionArray(int[] a) {
//		int i = 0;
//		int j = a.length - 1;
//		while (i < j) {
//			i++;
//			j--;
//		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (i + j == a.length) {
					if (a[i] + a[j] > 10) {
						return 0;
					}
				}
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		new Onion().solve();
	}

}

package mum.practice.p8;

import mum.practice.Solution;

public class Vanilla extends Solution {

	public Vanilla() {
		input = "5 1 1 11 1111 111211";
	}
	@Override
	public Object solve() {
		super.solve();
		int[] a = readArray();
		output = isVanilla(a);
		printResult();
		return null;
	}
	
	private Object isVanilla(int[] a) {
		int prev = -1;
		for (int i = 0; i < a.length; i++) {
			int v = elemVanilla(Math.abs(a[i]));
			if (v == -1) {
				return 0;
			}
			if (prev != -1 && v != prev) {
				return 0;
			}
			prev = v;
		}
		return 1;
	}
	private int elemVanilla(int n) {
		int prev = -1;
		do {
			int d = n % 10;
			if (prev != -1 && d != prev) {
				return -1;
			}
			prev = d;
			n = n/10;
		} while (n > 0);
		return prev;
	}
	public static void main(String[] args) {
		new Vanilla().solve();
	}

}

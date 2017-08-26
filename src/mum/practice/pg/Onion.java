package mum.practice.pg;

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
		return null;
	}
	
	private Object isOnionArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				
			}
		}
		return null;
	}

	public static void main(String[] args) {
		new Onion().solve();
	}

}

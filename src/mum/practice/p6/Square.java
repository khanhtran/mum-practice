package mum.practice.p6;

import mum.practice.Solution;

public class Square extends Solution {

	public Square() {
		input = 144;
	}

	@Override
	public Object solve() {
		super.solve();
		output = isSquare(Integer.valueOf(input.toString()));
		printResult();
		return null;
	}
	
	private Object isSquare(int n) {
		int k = 1;
		while (k * k < n) {
			k++;
		}
		if (k*k == n) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		new Square().solve();
	}

}

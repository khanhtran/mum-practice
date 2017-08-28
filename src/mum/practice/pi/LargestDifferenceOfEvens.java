package mum.practice.pi;

import mum.practice.Solution;

public class LargestDifferenceOfEvens extends Solution {

	public LargestDifferenceOfEvens() {
	}

	@Override
	public void solve2() {
		// TODO Auto-generated method stub
		super.solve2();
		output = largestDifferenceOfEvens(new int[] { -2, 3, 4, 9 });
		printResult();
	}

	private Object largestDifferenceOfEvens(int[] a) {
		if (a.length < 2) {
			return -1;
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[j] % 2 == 0) {
						sum += Math.abs(a[i] - a[j]);
					}
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		new LargestDifferenceOfEvens().solve2();
	}

}

package mum.practice.pi;

import mum.practice.Solution;

public class SysIncrease extends Solution {

	public SysIncrease() {
		input = "6 1 1 2 1 2 3";
	}
	@Override
	public void solve2() {
		super.solve2();
		int[] a = readArray();
		output = isSysIncrease(a);
		printResult();
	}
	private Object isSysIncrease(int[] a) {
		int n = 1; /*current chunk length*/
		int i = 0;
		while (i < a.length) {
			if (!subArrayIncrease(a, i, n)) {
				return 0;
			}
			i = i + n;
			n++;
		}
		return 1;
	}
	private boolean subArrayIncrease(int[] a, int start, int length) {
		for (int i = 0; i < length; i++) {
			if (a[i + start] != i+1) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		new SysIncrease().solve2();
	}

}

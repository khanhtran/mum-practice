package mum.practice.p6;

import mum.practice.Solution;

public class BaseConvert extends Solution {
	public BaseConvert() {
		input = "3 3 2 5";
	}
	@Override
	public Object solve() {
		super.solve();
		int[] a = readArray();
		output = convertToBase10(a, 8);
		printResult();
		return null;
	}
	private Object convertToBase10(int[] a, int n) {
		int res = 0;
		int base = 1;
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] < 0 || a[i] >= n) {
				return -1;
			}
			res += a[i]*base;
			base = base*n; 
		}
		return res;
	}
	public static void main(String[] args) {
		new BaseConvert().solve();
	}
}

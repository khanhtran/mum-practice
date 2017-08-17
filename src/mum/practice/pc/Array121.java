package mum.practice.pc;

import mum.practice.Solution;

/**
 * Define an array to be a 121 array if all its elements are either 1 or 2 and
 * it begins with one or more 1s followed by a one or more 2s and then ends with
 * the same number of 1s that it begins with. Write a method named is121Array
 * that returns 1 if its array argument is a 121 array otherwise it returns 0.
 * 
 * @author Khanh
 *
 */
public class Array121 extends Solution {

	public Array121() {
		input = "8 1 1 2 2 2 1 1 1";
	}
	@Override
	public Object solve() {
		super.solve();
		int[] a = readArray();
		output = is121Array(a);
		printResult();
		return null;
	}
	private Object is121Array(int[] a) {
		int l = 0;
		int r = a.length - 1;
		while (l < r && a[l] == 1 && a[r] == 1) {
			l++;
			r--;
		}
		if (l < r) {
			int i = l;
			for (; i <= r; i++) {
				if (a[i] != 2) {
					break;
				}
			}
			if (i > r) {
				return 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		new Array121().solve();
	}

}

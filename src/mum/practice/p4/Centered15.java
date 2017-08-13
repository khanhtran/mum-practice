package mum.practice.p4;

import mum.practice.Solution;

public class Centered15 extends Solution {

	public Centered15() {		
		input = "6 2 10 4 1 6 9";
	}

	public Object solve() {
		super.solve();
		int[] a = readArray();
		output = isCentered15(a);
		printResult();
		return null;
	}
	
	private Object isCentered15(int[] a) {
		int l, r;
		l = a.length/2;
		int sum = 0;
		if (a.length%2 != 0) {
			r = l;			
		} else {
			r = l + 1;			
		}
		while (sum != 15 && l >= 0 && r < a.length) {
			if (l != r) {
				sum += a[l] + a[r];
			} else {
				sum += a[l];
			}
			l--;
			r++;
		}
		if (l >= 0 && r < a.length) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		new Centered15().solve();
	}
}

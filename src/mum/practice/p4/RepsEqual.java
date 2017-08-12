package mum.practice.p4;

import mum.practice.Solution;

public class RepsEqual extends Solution {

	public RepsEqual() {
		input = "5 3 2 0 5 3";
	}
	
	@Override
	public Object solve() {
		// TODO Auto-generated method stub
		super.solve();
		int a[] = readArray();
		int v = 32053;
		output = checkRepsEqual(a, v);
		printResult();
		return null; 
	}

	private Object checkRepsEqual(int[] a, int v) {
		int k = calValue(a);
		if (k == v) {
			return 1;
		} else {
			return 0;
		}		
	}

	private int calValue(int[] a) {
		int val = 0;
		int p = 0;
		for (int i = a.length -1 ; i >= 0; i-- ) {
			val += a[i] * Math.pow(10, p);
			p++;
		}
		return val;
	}

	public static void main(String[] args) {
		new RepsEqual().solve();
	}

}

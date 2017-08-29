package mum.practice.pj;

import mum.practice.Solution;

public class ClosestFibo extends Solution {

	public ClosestFibo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void solve2() {
		// TODO Auto-generated method stub
		super.solve2();
		output = closestFibo(35);
		printResult();
	}
	
	private Object closestFibo(int n) {
		if (n == 1 || n == 2 || n == 3) {
			return n;
		}
		int k = 1;
		int f1 = 1;
		int f2 = 1;
		int f = 0;
		do {
			f = f1 + f2;
			f2 = f1;
			f1 = f;
//			System.out.println(f);
		} while (f < n);
		if (f == n) {
			return f;
		} else {
			return f2;
		}
	}

	
	public static void main(String[] args) {
		new ClosestFibo().solve2();

	}

}

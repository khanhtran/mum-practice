package mum.practice.pk;

import mum.practice.Solution;

public class Fibo extends Solution {

	public Fibo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void solve2() {
		// TODO Auto-generated method stub
		super.solve2();
		output = isFibo(13);
		printResult();
	}

	private Object isFibo(int n) {
		if (n == 1 || n == 2 || n == 3) {
			return 1;
		}
		int f1 = 1;
		int f2 = 1;
		int f = 0;
		do {
			f = f1 + f2;
			f2 = f1;
			f1 = f;
		} while (f < n);
		if (f == n) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		new Fibo().solve2();

	}

}

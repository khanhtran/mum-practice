package mum.practice.pi;

import mum.practice.Solution;

public class Factorial extends Solution {

	public Factorial() {
	}

	public int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return factorial(n - 1) * n;
		}
	}

	@Override
	public void solve2() {
		super.solve2();
		output = isFactorialPrime(7);
		printResult();
	}

	private Object isFactorialPrime(int n) {
		boolean prime = isPrime(n);
		if (!prime) {
			return 0;
		}
		int k = 0;
		int f = 1;
		do {
			if (k == 0) {
				f = 1;
			} else {
				f = f * k;
			}
//			System.out.println(f);
			k++;
		} while (f + 1 < n);
		if (f + 1 == n) {
			return 1;
		}
		return 0;
	}

	private boolean isPrime(int n) {
		if (n == 1 || n == 2 || n == 3) {
			return true;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		new Factorial().solve2();
	}

}

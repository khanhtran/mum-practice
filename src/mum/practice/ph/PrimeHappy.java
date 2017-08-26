package mum.practice.ph;

import mum.practice.Solution;

public class PrimeHappy extends Solution {

	public PrimeHappy() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void solve2() {
		super.solve2();
		output = isPrimeHappy(32);
		printResult();
	}
	
	private Object isPrimeHappy(int n) {
		int s = getSumPrime(n);
		if (s > 0 && s%n == 0) {
			return 1;
		}
		return 0;
	}

	private int getSumPrime(int n) {
		int sum = 0;
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		return sum;
	}

	private boolean isPrime(int n) {
		if (n == 2 || n == 3) {
			return true;
		}
		for (int i = 2; i*i <= n; i++) {
			if (n %i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		new PrimeHappy().solve2();

	}

}

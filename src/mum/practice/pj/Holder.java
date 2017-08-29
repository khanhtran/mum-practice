package mum.practice.pj;

import mum.practice.Solution;

/**
 * 1. A hodder number is one that is prime and is equal to 2j-1 for some j. For
 * example, 31 is a hodder number because 31 is prime and is equal to 25-1 (in
 * this case j = 5). The first 4 hodder numbers are 3, 7, 31, 127 Write a
 * function with signature int isHodder(int n) that returns 1 if n is a hodder
 * number, otherwise it returns 0. Recall that a prime number is a whole number
 * greater than 1 that has only two whole number factors, itself and 1.
 * 
 * @author Khanh
 *
 */
public class Holder extends Solution {

	public Holder() {
	}

	@Override
	public void solve2() {
		super.solve2();
		output = isHolderNumber(31);
		printResult();
	}

	private Object isHolderNumber(int n) {
		if (!isPrime(n)) {
			return 0;
		}
		int j = 0;
		int k = 0;
		do {
			k = (int) Math.pow(2, j) - 1;
			j++;
		} while (k < n);
		if (k == n) {
			return 1;
		}
		return 0;
	}

	private boolean isPrime(int n) {
		if (n == 2 || n == 3) {
			return true;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		new Holder().solve2();
	}

}

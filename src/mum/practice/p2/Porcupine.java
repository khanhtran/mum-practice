package mum.practice.p2;

import mum.practice.Solution;

public class Porcupine extends Solution {
	public Porcupine() {
		input = "139";
	}
	@Override
	public Object solve() {
		int n = Integer.parseInt(input.toString());
		output  = findPorcupineNumber(n);
		printResult();
		return null;
	}

	private Object findPorcupineNumber(int n) {
		int i = n + 1;
		while (true) {
			if (isPrime(i)) {
				if (endOf(i) == 9) {
					int j = nextPrime(i);
					if (endOf(j) == 9) {
						return i;
					}
				}
			}
			i++;
		}
	}
	private int nextPrime(int n) {
		int k = n + 1;
		while (!isPrime(k)) {
			k++;
		}
		return k;
	}
	private int endOf(int n) {
		int r = n%10;
		return r;
	}
	
	private boolean isPrime(int n) {
		if (n == 1 || n == 3) {
			return true;
		}
		for (int i = 2; i*i <= n; i += 1) {
			if (n %i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		new Porcupine().solve();
	}

}

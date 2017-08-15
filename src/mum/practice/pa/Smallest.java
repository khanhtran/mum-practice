package mum.practice.pa;

import mum.practice.Solution;

/**
 * 1. The number 124 has the property that it is the smallest number whose first
 * three multiples contain the digit 2. Observe that 124*1 = 124, 124*2 = 248,
 * 124*3 = 372 and that 124, 248 and 372 each contain the digit 2. It is
 * possible to generalize this property to be the smallest number whose first n
 * multiples each contain the digit 2. Write a function named smallest(n) that
 * returns the smallest number whose first n multiples contain the digit 2.
 * Hint: use modulo base 10 arithmetic to examine digits.
 * 
 * @author Khanh
 *
 */
public class Smallest extends Solution {

	public Smallest() {
		input = "";
	}

	@Override
	public Object solve() {
		super.solve();
		output = smallest(4);
		printResult();
		return null;
	}

	private Object smallest(int n) {
		int i = 1;
		while (true) {
			int j = 1;
			for (; j <= n; j++) {
				int num = j * i;
				boolean foundThis = false;
				do {
					int d = num % 10;
					if (d == 2) {
						foundThis = true;
						break;
					}
					num = num /10;
				} while (num > 0);
				if (!foundThis) {
					break;
				}
			}
			if (j > n) {
				break;
			}
			i++;
		}
		return i;
	}

	public static void main(String[] args) {
		new Smallest().solve();

	}

}

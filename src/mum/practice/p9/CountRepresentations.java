package mum.practice.p9;

import mum.practice.Solution;

/**
 * Write a function named countRepresentations that returns the number of ways
 * that an amount of money in rupees can be represented as rupee notes. For this
 * problem we only use rupee notes in denominations of 1, 2, 5, 10 and 20 rupee
 * notes. The signature of the function is: int countRepresentations(int
 * numRupees)
 * 
 * @author Khanh
 *
 */
public class CountRepresentations extends Solution {

	public CountRepresentations() {
		input = "657";
	}

	@Override
	public Object solve() {
		super.solve();
		int n = sc.nextInt();
		output = countRepresentations(n);
		printResult();
		return null;
	}

	private Object countRepresentations(int n) {
		int count = 0;
		for (int rupee20 = 0; rupee20 <= n / 20; rupee20++) {
			for (int rupee10 = 0; rupee10 <= (n - rupee20 * 20) / 10; rupee10++) {
				for (int rupee5 = 0; rupee5 <= (n - rupee10 * 10) / 5; rupee5++) {
					for (int rupee2 = 0; rupee2 <= (n - rupee5 * 5) / 2; rupee2++) {
						for (int rupee1 = 0; rupee1 <= (n - rupee2 * 2); rupee1++) {
							if (n == (20 * rupee20 + 10 * rupee10 + 5 * rupee5 + 2 * rupee2 + rupee1)) {
								count++;
							}
						}
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		new CountRepresentations().solve();
	}
}

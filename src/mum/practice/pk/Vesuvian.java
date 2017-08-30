package mum.practice.pk;

import mum.practice.Solution;

/**
 * A number n is vesuvian if it is the sum of two different pairs of squares.
 * For example, 50 is vesuvian because 50 == 25 + 25 and 1 + 49. The numbers 65
 * (1+64, 16+49) and 85 (4+81, 36+49) are also vesuvian. 789 of the first 10,000
 * integers are vesuvian. Write a function named isVesuvian that returns 1 if
 * its parameter is a vesuvian number, otherwise it returns 0. Hint: be sure to
 * verify that your function detects that 50 is a vesuvian number!
 * 
 * @author Khanh
 *
 */
public class Vesuvian extends Solution {

	public Vesuvian() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void solve2() {
		// TODO Auto-generated method stub
		super.solve2();
		output = isVesuvian(51);
		printResult();
	}

	private Object isVesuvian(int n) {
		int pairCount = 0;
		for (int i = 1; i <= n; i++) {
			if (perfectSquare(i)) {
				for (int j = 1; j <= n; j++) {
					if (perfectSquare(j)) {
						if (n == i + j) {
							pairCount++;
							if (pairCount == 2) {
								return 1;
							}
						}
					}
				}
			}
		}
		return 0;
	}

	private boolean perfectSquare(int n) {
		int sqrt = (int) Math.sqrt(n);
		return (sqrt * sqrt == n);
	}

	public static void main(String[] args) {
		new Vesuvian().solve2();
	}

}

package mum.practice.pf;

import mum.practice.Solution;

public class CubePowerful extends Solution {

	public CubePowerful() {
		input = "";
	}

	@Override
	public Object solve() {
		super.solve();
		output = isCubePowerful(154);
		printResult();
		return null;
	}

	private Object isCubePowerful(int n) {
		if (n <= 0) {
			return 0;
		}
		if (n == getCube(n)) {
			return 1;
		}
		return 0;
	}

	/**
	 * sum cube of digits
	 * 
	 * @param n
	 * @return
	 */
	private int getCube(int n) {
		int sum = 0;
		do {
			int d = n % 10;
			sum += d * d * d;
			n = n / 10;
		} while (n > 0);
		return sum;
	}

	public static void main(String[] args) {
		new CubePowerful().solve();
	}

}

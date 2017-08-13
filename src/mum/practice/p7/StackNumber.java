package mum.practice.p7;

import mum.practice.Solution;

public class StackNumber extends Solution {

	public StackNumber() {
		input = "";
	}
	
	@Override
	public Object solve() {		
		super.solve();
		output = isStack(16);
		printResult();
		return null;
	}
	
	private Object isStack(int n) {
		int sum = 0;
		int k = 1;
		while (sum < n) {
			sum += k;
			k++;
		}
		if (sum == n) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		new StackNumber().solve();
	}

}

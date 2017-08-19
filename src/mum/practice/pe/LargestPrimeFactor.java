package mum.practice.pe;

import java.util.ArrayList;
import java.util.List;

import mum.practice.Solution;

public class LargestPrimeFactor extends Solution {

	public LargestPrimeFactor() {
		input = "";
	}

	@Override
	public Object solve() {
		super.solve();
		int n = 6936;
		output = largestPrimeFactor(n);
		printResult();
		return null;
	}

	private Object largestPrimeFactor(int n) {
		if (n <= 1) {
			return 0;
		}
		List<Integer> lst = primeFactors(n);
		return max(lst);
	}

	private Object max(List<Integer> lst) {
		int max = -1;
		for (int m : lst) {
			if (m > max) {
				max = m;
			}
		}
		return max;
	}

	private List<Integer> primeFactors(int n) {
		List<Integer> pFactors = new ArrayList<>();
		int d = 2;
		while (n > 1) {
			while (n % d == 0) {
				pFactors.add(d);
				n = n / d;
			}
			d++;
		}
		return pFactors;
	}

	public static void main(String[] args) {
		new LargestPrimeFactor().solve();
	}

}

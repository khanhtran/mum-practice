package mum.practice.pe;

import mum.practice.Solution;

public class ArrayPattern extends Solution {

	public ArrayPattern() {

	}

	@Override
	public Object solve() {
		output = matchPattern(new int[] { 1, 1, 1, 2, 2, 1, 1, 3 }, 8, new int[] { 1, 2, 1, 3 }, 4);
		printResult();
		return null;
	}

	private Object matchPattern(int[] a, int len, int[] pattern, int patternLen) {
		// len is the number of elements in the array a, patternLen is the number of
		// elements in the pattern.
		int i = 0; // index into a
		int k = 0; // index into pattern
		int matches = 0; // how many times current pattern character has been matched so far
		for (i = 0; i < len; i++) {
			if (a[i] == pattern[k]) {
				matches++; // current pattern character was matched
			} else if (matches == 0 || k == patternLen - 1) {
				return 0; // if pattern[k] was never matched (matches==0) or at end of pattern
							// (k==patternLen-1)
			} else // advance to next pattern character
			{
				k++;
				i--;
			} // end of else
		} // end of for
			// return 1 if at end of array a (i==len) and also at end of pattern
			// (k==patternLen-1)
		if (i == len && k == patternLen - 1) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		new ArrayPattern().solve();
	}

}

package p42;

public class Matching {

	public Matching() {
		// TODO Auto-generated constructor stub
	}

	static int matchPattern(int[] a, int len, int[] pattern, int patternLen) {
		// len is the number of elements in the array a, patternLen is the number of
		// elements in the pattern.
		int i = 0; // index into a
		int k = 0; // index into pattern
		int matches = 0; // how many times current pattern character has been matched so far
		for (i = 0; i < len; i++) {
			if (a[i] == pattern[k]) {
				matches++; // current pattern character was matched
			} else if (matches == 0 || k == patternLen - 1) {
				return 0; // if pattern[k] was never matched (matches==0) or at end of pattern //
							// (k==patternLen-1)
			} else {// advance to next pattern character {
				k++;
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
		assert matchPattern(new int[] { 1, 1, 2, 2, 2, 2 }, 6, new int[] { 1, 2 }, 2) == 1;
		assert matchPattern(new int[] { 1, 2}, 2, new int[] { 1, 2, 3 }, 3) == 0;
		System.out.println("Done");
	}

}

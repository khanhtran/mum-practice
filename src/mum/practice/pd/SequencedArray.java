package mum.practice.pd;

import java.util.ArrayList;
import java.util.List;

import mum.practice.Solution;

/**
 * Define an m-n sequenced array to be an array that contains one or more
 * occurrences of all the integers between m and n inclusive. Furthermore, the
 * array must be in ascending order and contain only those integers. For
 * example, {2, 2, 3, 4, 4, 4, 5} is a 2-5 sequenced array. The array {2, 2, 3,
 * 5, 5, 5} is not a 2-5 sequenced array because it is missing a 4. The array
 * {0, 2, 2, 3, 3} is not a 2-3 sequenced array because the 0 is out of range.
 * And {1,1, 3, 2, 2, 4} is not a 1-4 sequenced array because it is not in
 * ascending order. Write a method named isSequencedArray that returns 1 if its
 * argument is a m-n sequenced array, otherwise it returns 0.
 * 
 * @author Khanh
 *
 */
public class SequencedArray extends Solution {

	public SequencedArray() {
		input = "7 2 2 3 4 4 4 5";
	}

	@Override
	public Object solve() {
		super.solve();
		int[] a = readArray();
		output = isSequencedArray(a, 2, 5);
		printResult();
		return null;
	}

	private Object isSequencedArray(int[] a, int m, int n) {
		boolean containAll = isContainAll(a, m, n);
		if (containAll) {
			boolean ascSorted = isAscSorted(a);
			if (ascSorted) {
				boolean containOnly = isContainOnly(a, m, n);
				return containOnly ? 1 : 0;
			}
		}
		return 0;
	}

	private boolean isContainOnly(int[] a, int m, int n) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] < m || a[i] > n) {
				return false;
			}
		}
		return true;
	}

	private boolean isAscSorted(int[] a) {
		int l = 0;
		int r = 1;
		for (; r < a.length; r++, l++) {
			if (a[r] < a[l]) {
				return false;
			}
		}
		return true;
	}

	private boolean isContainAll(int[] a, int m, int n) {
		List<Integer> lst = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			lst.add(a[i]);
		}
		for (int k = m; k <= n; k++) {
			if (!lst.contains(k)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		new SequencedArray().solve();
	}

}

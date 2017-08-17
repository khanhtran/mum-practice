package mum.practice.pc;

import java.util.ArrayList;
import java.util.List;

import mum.practice.Solution;

/**
 * A binary representation of a number can be used to select elements from an
 * array. For example, n: 88 = 23 + 24 + 26 (1011000) array: 8, 4, 9, 0, 3, 1, 2
 * indexes 0 1 2 3 4 5 6 selected * * * result 0, 3, 2 so the result of
 * filtering {8, 4, 9, 0, 3, 1, 2} using 88 would be {0, 3, 2} In the above, the
 * elements that are selected are those whose indices are used as exponents in
 * the binary representation of 88. In other words, a[3], a[4], and a[6] are
 * selected for the result because 3, 4 and 6 are the powers of 2 that sum to
 * 88. Write a method named filterArray that takes an array and a non-negative
 * integer and returns the result of filtering the array using the binary
 * representation of the integer. The returned array must big enough to contain
 * the filtered elements and no bigger. So in the above example, the returned
 * array has length of 3, not 7 (which is the size of the original array.)
 * Futhermore, if the input array is not big enough to contain all the selected
 * elements, then the method returns null. For example, if n=3 is used to filter
 * the array a = {18}, the method should return null because 3=20+21 and hence
 * requires that the array have at least 2 elements a[0] and a[1], but there is
 * no a[1]
 * 
 * @author Khanh
 *
 */
public class BinaryFilter extends Solution {

	public BinaryFilter() {
		input = "7 8 4 9 0 3 1 2";
	}

	@Override
	public Object solve() {
		super.solve();
		int[] a = readArray();
		output = filterArray(a, 88);
		printResult();
		return null;
	}

	private Object filterArray(int[] a, int n) {
		int[] binaryArray = toBinaryArray(n);
		int length = 0;
		for (int i = 0; i < binaryArray.length; i++) {
			if (binaryArray[i] == 1) {
				length++;
			}
		}
		if (length > a.length) {
			return null;
		}
		int[] result = new int[length];
		List<Integer> idxLst = new ArrayList<>();
		for (int i = 0; i < binaryArray.length; i++) {
			if (binaryArray[i] == 1) {
				idxLst.add(0, binaryArray.length - 1 - i);
			}
		}
		int k = 0;
		for (int idx : idxLst) {
			result[k++] = a[idx];
		}
		return result;
	}

	private int[] toBinaryArray(int n) {
		List<Integer> lst = new ArrayList<>();
		do {
			lst.add(0, n % 2);
			n = n / 2;
		} while (n > 0);
		int[] b = new int[lst.size()];
		for (int i = 0; i < lst.size(); i++) {
			b[i] = lst.get(i);
		}
		return b;
	}

	public static void main(String[] args) {
		new BinaryFilter().solve();
	}

}

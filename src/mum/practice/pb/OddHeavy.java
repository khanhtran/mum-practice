package mum.practice.pb;

import mum.practice.Solution;

/**
 * An array is defined to be odd-heavy if it contains at least one odd element
 * and every element whose value is odd is greater than every even-valued
 * element. So {11, 4, 9, 2, 8} is odd-heavy because the two odd elements (11
 * and 9) are greater than all the even elements. And {11, 4, 9, 2, 3, 10} is
 * not odd-heavy because the even element 10 is greater than the odd element 9.
 * Write a function called isOddHeavy that accepts an integer array and returns
 * 1 if the array is odd-heavy; otherwise it returns 0.
 * 
 * @author Khanh
 *
 */
public class OddHeavy extends Solution {

	public OddHeavy() {
//		input = "5 11 4 9 2 8";
		input = "6 11 4 9 2 3 10";
	}
	@Override
	public Object solve() {
		super.solve();
		int a[] = readArray();
		output = isOddHeavy(a);
		printResult();
		return null;
	}
	private Object isOddHeavy(int[] a) {
		int minOddIdx = mindOdd(a);
		int maxEvenIdx = maxEven(a);
		if (minOddIdx > -1) {
			if (maxEvenIdx == -1 || a[minOddIdx] > a[maxEvenIdx]) {
				return 1;
			}
		}
		return 0;
	}
	private int maxEven(int[] a) {
		int idx = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				if (idx == -1 || a[i] > a[idx]) {
					idx = i;
				}
			}
		}
		return idx;
	}
	private int mindOdd(int[] a) {
		int idx = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				if (idx == -1 || a[i] < a[idx]) {
					idx = i;
				}
			}
		}
		return idx;
	}
	
	public static void main(String[] args) {
		new OddHeavy().solve();
	}

}

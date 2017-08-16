package mum.practice.pa;

import mum.practice.Solution;

/**
 * 3. Define an array to be a railroad-tie array if the following three
 * conditions hold a. The array contains at least one non-zero element b. Every
 * non-zero element has exactly one non-zero neighbor c. Every zero element has
 * two non-zero neighbors. For example, {1, 2, 0, 3, -18, 0, 2, 2} is a
 * railroad-tie array because a[0] = 1 has exactly one non-zero neighbor (a[1])
 * a[1] = 2 has exactly one non-zero neighbor (a[0]) a[2] = 0 has two non-zero
 * neighbors (a[1] and a[3]) a[3] = 3 has exactly one non-zero neighbor (a[4])
 * a[4] = -18 has exactly one non-zero neighbor (a[3]) a[5] = 0 has two non-zero
 * neighbors (a[4] and a[6]) a[6] = 2 has exactly one non-zero neighbor (a[7])
 * a[7] = 2 has exactly one non-zero neighbor (a[6])
 * 
 * @author Khanh
 *
 */
public class Railroad extends Solution {

	public Railroad() {
//		input = "8 1 2 0 3 -18 0 2 2";
		input = "6 1 2 3 0 2 2";
	}

	@Override
	public Object solve() {
		super.solve();
		int[] a = readArray();
		output = isRailroadTie(a);
		printResult();
		return null;
	}

	private Object isRailroadTie(int[] a) {
		int chk1 = checkNonzero(a);
		if (chk1 == 1) {
			int chk2 = checkZero(a);
			if (chk2 == 1) {
				return 1;
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	}

	private int checkZero(int[] a) {
		int i = 0;
		for (; i < a.length; i++) {
			if (a[i] == 0) {
				if (i == 0 || i == (a.length - 1)) {
					break;
				} else {
					if ((a[i - 1] * a[i + 1]) == 0) {
						break;
					}
				}
			}
		}
		if (i == a.length) {
			return 1;
		} else {
			return 0;
		}
	}

	private int checkNonzero(int[] a) {
		int i = 0;
		int count = 0;
		for (; i < a.length; i++) {
			if (a[i] != 0) {
				count++;
				if (i == 0) {
					if (a[i + 1] == 0) {
						break;
					}
				} else if (i == (a.length - 1)) {
					if (a[i - 1] == 0) {
						break;
					}
				} else {
					if (a[i - 1] == 0 && a[i + 1] == 0) {
						break;
					}
					if (a[i - 1] != 0 && a[i + 1] != 0) {
						break;
					}
				}
			}
		}
		if (count > 0 && i == a.length) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		new Railroad().solve();
	}

}

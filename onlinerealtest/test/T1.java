package test;

public class T1 {

	public T1() {

	}

	static int hasSingleMaximum(int[] a) {
		if (a.length == 0) {
			return 0;
		}
		int max = Integer.MIN_VALUE;
		boolean singleMaximum = true;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				singleMaximum = true;
			} else if (a[i] < max) {
				singleMaximum = true;
			} else { // a[i] == max
				singleMaximum = false;
			}
		}
		if (singleMaximum) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// assert hasSingleMaximum(new int[] {1, 2, 3, 1, 0}) == 1;
		// assert hasSingleMaximum(new int[] {18}) == 1;
		// assert hasSingleMaximum(new int[] {1, 2, 3, 0, 1, 3}) == 0;
		// assert hasSingleMaximum(new int[] {13, 1, 13, 2, 13, 0, 13, 1, 13}) == 0;
		// assert hasSingleMaximum(new int[] {}) == 0;
		// assert hasSingleMaximum(new int[] {-6, -6, -6, -6, -6, -6, -6}) == 0;
	}

}

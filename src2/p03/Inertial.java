package p03;

public class Inertial {

	public Inertial() {
		// TODO Auto-generated constructor stub
	}

	public int isIntertial(int[] a) {
		if (!containsOddValue(a)) {
			return 0;
		}
		int max = findMax(a);
		if (max % 2 != 0) {
			return 0;
		}

		if (!isOddGreaterThanAllEvenExceptMax(a, max)) {
			return 0;
		}
		return 1;
	}

	private boolean isOddGreaterThanAllEvenExceptMax(int[] a, int max) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				for (int j = 0; j < a.length; j++) {
					if (a[j] % 2 == 0) {
						if (a[i] < a[j] && a[j] != max) {
							return false;
						}
					}
				}
			}
		}

		return true;
	}

	private int findMax(int[] a) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (i == 0 || a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	private boolean containsOddValue(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		assert new Inertial().isIntertial(new int[] { 11, 4, 20, 9, 2, 8 }) == 1;
		assert new Inertial().isIntertial(new int[] { 12, 11, 4, 9, 2, 3, 10 }) == 0;
		assert new Inertial().isIntertial(new int[] { 1 }) == 0;
		assert new Inertial().isIntertial(new int[] { 2 }) == 0;
		assert new Inertial().isIntertial(new int[] { 1, 2, 3, 4 }) == 0;
		assert new Inertial().isIntertial(new int[] { 1, 1, 1, 1, 1, 1, 2 }) == 1;
		assert new Inertial().isIntertial(new int[] { 2, 12, 4, 6, 8, 11 }) == 1;
		assert new Inertial().isIntertial(new int[] { 2, 12, 12, 4, 6, 8, 11 }) == 1;
		assert new Inertial().isIntertial(new int[] { -2, -4, -6, -8, -11 }) == 0;
		assert new Inertial().isIntertial(new int[] { 2, 3, 5, 7 }) == 0;
		assert new Inertial().isIntertial(new int[] { 2, 4, 6, 8, 10 }) == 0;
	}

}

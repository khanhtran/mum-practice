package p04;

public class SquarePair {

	public SquarePair() {

	}

	int countSquarePairs(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i != j) {
					if (squarePair(a[i], a[j])) {
						count++;
					}
				}
			}
		}
		return count;
	}

	private boolean squarePair(int x, int y) {
		if (x > 0 && y > 0 && x < y) {
			if (isPerfectSquare(x + y)) {
				return true;
			}
		}
		return false;
	}

	private boolean isPerfectSquare(int n) {
		int k = 1;
		while (k * k < n) {
			k++;
		}
		if (k * k == n) {
			return true;
		}
		return false;
	}

	public static void main(String args[]) {
		assert new SquarePair().countSquarePairs(new int[] { 11, 5, 4, 20 }) == 3;
		assert new SquarePair().countSquarePairs(new int[] { 9, 0, 2, -5, 7 }) == 2;
		assert new SquarePair().countSquarePairs(new int[] { 9 }) == 0;
	}
}

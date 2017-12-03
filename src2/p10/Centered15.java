package p10;

public class Centered15 {

	public Centered15() {
	}

	int isCentered15(int[] a) {
		int i, j;
		int n = a.length;
		int sum = 0;
		if (n % 2 == 0) {
			i = n / 2;
			j = i + 1;
		} else {
			i = j = n / 2;
		}

		do {
			if (i == j) {
				sum += a[i];
			} else {
				sum += a[i] + a[j];
			}
			if (sum == 15) {
				return 1;
			}
			i--;
			j++;
		} while (i >= 0 && j < n);
		return 0;
	}

	public static void main(String[] args) {
		assert new Centered15().isCentered15(new int[] { 3, 2, 10, 4, 1, 6, 9 }) == 1;
		assert new Centered15().isCentered15(new int[] { 2, 10, 4, 1, 6, 9 }) == 0;
		assert new Centered15().isCentered15(new int[] { 3, 2, 10, 4, 1, 6 }) == 0;
		assert new Centered15().isCentered15(new int[] { 1, 1, 8, 3, 1, 1 }) == 0;
		assert new Centered15().isCentered15(new int[] { 9, 15, 6 }) == 1;
		assert new Centered15().isCentered15(new int[] { 1, 1, 2, 2, 1, 1 }) == 0;
		assert new Centered15().isCentered15(new int[] { 1, 1, 15, - 1, -1 }) == 1;
		System.out.println("done");

	}

}

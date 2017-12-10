package p21;

public class Vanilla {

	public Vanilla() {
		// TODO Auto-generated constructor stub
	}

	int isVanilla(int[] a) {
		if (a.length == 0) {
			return 1;
		}
		int b = vanilla(a[0]);
		if (b == -1) {
			return 0;
		}
		for (int i = 1; i < a.length; i++) {
			int c = vanilla(Math.abs(a[i]));
			if (c != b) {
				return 0;
			}
		}
		return 1;
	}

	private int vanilla(int n) {
		if (n == 0) {
			return 1;
		}
		int k = -1;
		while (n > 0) {
			int m = n % 10;
			if (k == -1) {
				k = m;
			} else {
				if (m != k) {
					return -1;
				}
			}
			n = n / 10;
		}
		return k;
	}

	public static void main(String[] args) {
		assert new Vanilla().isVanilla(new int[] { 1, 1, 11, 1111, 1111111 }) == 1;
		assert new Vanilla().isVanilla(new int[] { 11, 101, 1111, 11111 }) == 0;
		assert new Vanilla().isVanilla(new int[] { 1 }) == 1;
		assert new Vanilla().isVanilla(new int[] { 11, 22, 13, 34, 125}) == 0;
		assert new Vanilla().isVanilla(new int[] { 9, 999, 99999, -9999}) == 1;
		assert new Vanilla().isVanilla(new int[] {}) == 1;
		System.out.println("Done");
	}

}

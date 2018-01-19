package test;

public class T2 {

	public T2() {

	}

	static int is123Array(int[] a) {
		if ((a.length < 3) || (a.length % 3 != 0)) {
			return 0;
		}

		int i = 0;
		while (i < a.length) {
			if (a[i] != 1 || a[i + 1] != 2 || a[i + 2] != 3) {
				return 0;
			}
			i += 3;
		}
		return 1;
	}

	public static void main(String[] args) {
		// assert is123Array(new int[] {1, 2, 3, 1, 2, 3, 1, 2, 3}) == 1;
		// assert is123Array(new int[] {1, 2, 3, 1, 2}) == 0;
		// assert is123Array(new int[] {1, 2, 3, 3, 2, 1}) == 0;
		// assert is123Array(new int[] {0, 1, 2, 3, 1, 2, 3}) == 0;
		// assert is123Array(new int[] {1, 2, 3, 3, 2, 1, 1, 2, 3}) == 0;
		// assert is123Array(new int[] {1, 2, 3}) == 1;
		// assert is123Array(new int[] {}) == 0;
	}

}

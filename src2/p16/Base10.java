package p16;

public class Base10 {

	public Base10() {
		// TODO Auto-generated constructor stub
	}

	int isLegalNumber(int[] a, int base) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= base) {
				return 0;
			}
		}
		return 1;
	}

	int convertToBase10(int[] a, int base) {
		if (isLegalNumber(a, base) == 1) {
			int val = 0;
			int d = 1;
			for (int i = a.length - 1; i >= 0; i--) {
				val += a[i] * d;
				d = d * base;
			}
			return val;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		assert new Base10().convertToBase10(new int[] { 1, 0, 1, 1 }, 2) == 11;
		assert new Base10().convertToBase10(new int[] { 1, 1, 2 }, 3) == 14;
		assert new Base10().convertToBase10(new int[] { 3, 2, 5 }, 8) == 213;
		assert new Base10().convertToBase10(new int[] { 3, 7, 1 }, 6) == -1;
	}

}

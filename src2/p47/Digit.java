package p47;

public class Digit {

	public Digit() {
		// TODO Auto-generated constructor stub
	}

	int isDigitIncreasing(int n) {
		for (int k = 1; k <= 9; k++) {
			if (isDigitInc(n, k)) {
				return 1;
			}
		}
		return 0;
	}

	private boolean isDigitInc(int n, int k) {
		int sum = 0;
		int base = 1;
		int digit = 0;
		;
		while (sum < n) {
			digit = digit + k * base;
			base = base * 10;
			sum = sum + digit;
		}
		if (sum == n) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		assert new Digit().isDigitIncreasing(7) == 1;
		assert new Digit().isDigitIncreasing(36) == 1;
		assert new Digit().isDigitIncreasing(984) == 1;
		assert new Digit().isDigitIncreasing(7404) == 1;
		System.out.println("Done");
	}
}

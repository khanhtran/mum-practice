package p32;

import java.util.ArrayList;
import java.util.List;

public class FullnessQuotient {

	public FullnessQuotient() {
		// TODO Auto-generated constructor stub
	}

	int fullnessQuotient(int n) {
		if (n < 1) {
			return -1;
		}
		int result = 0;
		for (int base = 2; base <= 9; base++) {
			int[] digits = decomposeInteger(n, base);
			boolean isNozero = true;
			for (int i = 0; i < digits.length; i++) {
				if (digits[i] == 0) {
					isNozero = false;
				}
			}
			if (isNozero) {
				result++;
			}
		}
		return result;
	}

	private int[] decomposeInteger(int n, int base) {
		List<Integer> dList = new ArrayList<>();
		while (n > 0) {
			dList.add(n % base);
			n = n / base;
		}
		int[] digits = new int[dList.size()];
		for (int i = dList.size() - 1; i >= 0; i--) {
			digits[dList.size() - 1 - i] = dList.get(i);
		}
		return digits;
	}

	public static void main(String[] args) {
		assert new FullnessQuotient().fullnessQuotient(1) == 8;
		assert new FullnessQuotient().fullnessQuotient(9) == 5;
		assert new FullnessQuotient().fullnessQuotient(360) == 0;
		assert new FullnessQuotient().fullnessQuotient(-4) == -1;

	}

}

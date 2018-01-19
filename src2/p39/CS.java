package p39;

import java.util.ArrayList;
import java.util.List;

public class CS {

	public CS() {
		// TODO Auto-generated constructor stub
	}

	int checkConcatenatedSum(int n, int catlen) {
		int[] digits = toDigits(n);
		int sum = 0;
		for (int i = 0; i < digits.length; i++) {
			sum += multi(digits[i], catlen);
		}
		if (sum == n) {
			return 1;
		} else {
			return 0;
		}
	}

	private int multi(int n, int catlen) {
		int val = 0;
		int base = 1;
		for (int i = 0; i < catlen; i++) {
			val += n * base;
			base = base * 10;
		}
		return val;
	}

	private int[] toDigits(int n) {
		List<Integer> lst = new ArrayList<>();
		while (n > 0) {
			int d = n % 10;
			n = n / 10;
			lst.add(0, d);
		}
		int[] dArray = new int[lst.size()];
		for (int i = 0; i < lst.size(); i++) {
			dArray[i] = lst.get(i);
		}
		return dArray;
	}

	public static void main(String[] args) {
		assert new CS().checkConcatenatedSum(198, 2) == 1;
		assert new CS().checkConcatenatedSum(198, 3) == 0;
		assert new CS().checkConcatenatedSum(2997, 3) == 1;
		assert new CS().checkConcatenatedSum(2997, 2) == 0;
		assert new CS().checkConcatenatedSum(13332, 2) == 0;
		assert new CS().checkConcatenatedSum(9, 1) == 1;
		System.out.println("Done");
	}

}

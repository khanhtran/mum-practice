package p45;

import java.util.ArrayList;
import java.util.List;

public class Encode {

	public Encode() {
		// TODO Auto-generated constructor stub
	}

	int decodeArray(int[] a) {
		List<Integer> digits = new ArrayList<>();
		for (int i = 0; i < a.length - 1; i++) {
			int d = Math.abs(a[i] - a[i + 1]);
			digits.add(d);
		}

		int num = toNum(digits);
		if (a[0] < 0) {
			num = -1 * num;
		}
		return num;
	}

	private int toNum(List<Integer> digits) {
		int base = 1;
		int num = 0;
		for (int i = digits.size() - 1; i >= 0; i--) {
			num += digits.get(i) * base;
			base = base * 10;
		}
		return num;
	}

	public static void main(String[] args) {
		assert new Encode().decodeArray(new int[] { 0, -3, 0, -4, 0 }) == 3344;
		assert new Encode().decodeArray(new int[] { -1, 5, 8, 17, 15 }) == -6392;
		assert new Encode().decodeArray(new int[] { 1, 5, 8, 17, 15 }) == 4392;
		System.out.println("Done");
	}

}

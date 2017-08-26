package mum.practice.ph;

import java.util.ArrayList;
import java.util.List;

import mum.practice.Solution;

/**
 * An integer number can be encoded as an array as follows. Each digit n of the
 * number is represented by n zeros followed by a 1. So the digit 5 is
 * represented by 0, 0, 0, 0, 0, 1. The encodings of each digit of a number are
 * combined to form the encoding of the number. So the number 1234 is encoded as
 * the array {0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1}. The first 0, 1 is
 * contributed by the digit 1, the next 0, 0, 1 is contributed by the digit 2,
 * and so on. There is one other encoding rule: if the number is negative, the
 * first element of the encoded array must be -1, so -201 is encoded as {-1, 0,
 * 0, 1, 1, 0, 1}. Note that the 0 digit is represented by no zeros, i.e. there
 * are two consecutive ones! Write a method named encodeArray that takes an
 * integer as an argument and returns the encoded array.
 * 
 * @author Khanh
 *
 */
public class EncodeArray extends Solution {

	public EncodeArray() {
	}

	@Override
	public void solve2() {
		super.solve2();
		output = encodeArray(-1234);
		printResult();
	}

	private Object encodeArray(int n) {
		int sign;
		if (n < 0) {
			sign = -1;
			n = -1 * n;
		} else {
			sign = 1;
		}
		List<Integer> digits = toDigits(n);
		int sumDigits = 0;
		for (int d : digits) {
			sumDigits += d;
		}
		int[] a;
		int i;
		if (sign == 1) {
			a = new int[sumDigits + digits.size()];
			i = 0;
		} else {
			a = new int[sumDigits + digits.size() + 1];
			i = 1;
			a[0] = -1;
		}
		int k = 0;
		while (k < digits.size()) {
			int d = digits.get(k);
			k++;
			for (int j = 0; j < d; j++) {
				a[i++] = 0;
			}
			a[i++] = 1;
		}
		return a;
	}

	private List<Integer> toDigits(int n) {
		List<Integer> result = new ArrayList<>();
		do {
			int d = n % 10;
			result.add(0, d);
			n = n / 10;
		} while (n > 0);
		return result;
	}

	public static void main(String[] args) {
		new EncodeArray().solve2();
	}

}

package mum.practice.pg;

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
 * are two consecutive ones! Write a method named decodeArray that takes an
 * encoded array and decodes it to return the number. You may assume that the
 * input array is a legal encoded array, i.e., that -1 will only appear as the
 * first element, all elements are either 0, 1 or -1 and that the last element
 * is 1.
 * 
 * @author Khanh
 *
 */
public class DecodeArray extends Solution {

	public DecodeArray() {
		input = "14 0 1 0 0 1 0 0 0 1 0 0 0 0 1";
	}

	@Override
	public Object solve() {
		super.solve();
		int[] a = readArray();
		output = decodeArray(a);
		printResult();
		return null;
	}

	private Object decodeArray(int[] a) {
		int sign;
		List<Integer> nums;
		if (a[0] == -1) {
			sign = -1;
			nums = extractDigits(a, 1);
		}  else {
			sign = 1;
			nums = extractDigits(a, 0);
		}
		
		int value = sign*calDigit(nums);
		return value;
	}

	private int calDigit(List<Integer> nums) {
		int v = 0;
		for (int n : nums) {
			v = v*10 + n;
		}
		return v;
	}

	private List<Integer> extractDigits(int[] a, int start) {
		List<Integer> nums = new ArrayList<>();
		for (int i = start; i < a.length;) {
			int j = i;
			while (j < a.length && a[j] == 0) {
				j++;
			}
			int n = j - i;
			i = j + 1;
			nums.add(n);
		}
		return nums;
	}

	public static void main(String[] args) {
		new DecodeArray().solve();

	}

}

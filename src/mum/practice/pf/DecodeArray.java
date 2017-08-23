package mum.practice.pf;

import mum.practice.Solution;

/**
 * A number can be encoded as an integer array as follows. The first element of
 * the array is any number and if it is negative then the encoded number is
 * negative. Each digit of the number is the absolute value of the difference of
 * two adjacent elements of the array. The most significant digit of the number
 * is the absolute value of the difference of the first two elements of the
 * array. For example, the array {2, -3, -2, 6, 9, 18} encodes the number 51839
 * because  5 is abs(2 – (-3))  1 is abs(-3 – (-2))  8 is abs(-2 – 6)  3 is
 * abs(6-9)  9 is abs(9-18) The number is positive because the first element of
 * the array is >= 0. If you are programming in Java or C#, the function
 * prototype is int decodeArray(int[ ] a)
 * 
 * @author Khanh
 * Using sliding window
 */
public class DecodeArray extends Solution {

	public DecodeArray() {
		input = "6 2 -3 -2 6 9 18";
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
		int i = 0; 
		int j = 1;
		int n = 0;
		for (; j < a.length; i++, j++) {
			int d = Math.abs(a[i] - a[j]);
			n = n*10 + d;
		}
		if (a[0] < 0) {
			n = -1*n;
		}
		return n;
	}

	public static void main(String[] args) {
		new DecodeArray().solve();
	}

}

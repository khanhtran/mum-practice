package mum.practice.pd;

import mum.practice.Solution;

/**
 * The number 198 has the property that 198 = 11 + 99 + 88, i.e., if each of its
 * digits is concatenated twice and then summed, the result will be the original
 * number. It turns out that 198 is the only number with this property. However,
 * the property can be generalized so that each digit is concatenated n times
 * and then summed. For example, 2997 = 222+999+999+777 and here each digit is
 * concatenated three times. Write a function named checkContenatedSum that
 * tests if a number has this generalized property. The signature of the
 * function is int checkConcatenatedSum(int n, int catlen) where n is the number
 * and catlen is the number of times to concatenate each digit before summing.
 * The function returns 1 if n is equal to the sum of each of its digits
 * contenated catlen times. Otherwise, it returns 0. You may assume that n and
 * catlen are greater than zero
 * 
 * @author Khanh
 *
 */
public class ConcatenatedSum extends Solution {

	public ConcatenatedSum() {
		input = "";
	}
	@Override
	public Object solve() {
		output = isConcatenatedSum(198, 2);
		printResult();
		return null;
	}
	private Object isConcatenatedSum(int n, int catLen) {
		int sum = 0;
		int origN = n;
		do {
			int d = n%10;
			sum += toNumber(d, catLen);
			n = n/10;
		} while (n >0);
		return ((sum == origN) ? 1 : 0);
	}
	
	
	private int toNumber(int d, int catLen) {
		int number = 0;
		int base = 1;
		for (int i = 1; i <= catLen; i++) {
			number += d*base;
			base = base*10;
		}
		return number;
	}
	public static void main(String[] args) {
		new ConcatenatedSum().solve();
	}

}

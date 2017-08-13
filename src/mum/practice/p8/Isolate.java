package mum.practice.p8;

import java.math.BigInteger;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import mum.practice.Solution;

/**
 * Define a positive number to be isolated if none of the digits in its square
 * are in its cube. For example 163 is n isolated number because 69*69 = 26569
 * and 69*69*69 = 4330747 and the square does not contain any of the digits 0,
 * 3, 4 and 7 which are the digits used in the cube. On the other hand 162 is
 * not an isolated number because 162*162=26244 and 162*162*162 = 4251528 and
 * the digits 2 and 4 which appear in the square are also in the cube.Write a
 * function named isIsolated that returns 1 if its argument is an isolated
 * number, it returns 0 if its not an isolated number and it returns -1 if it
 * cannot determine whether it is isolated or not (see the note below).
 * 
 * @author Khanh
 *
 */
public class Isolate extends Solution {
	public Isolate() {
		input = "162";
	}
	
	@Override
	public Object solve() {
		super.solve();
		long n = sc.nextLong();
		output = isIsolated(n);
		printResult();
		return null;
	}
	
	public Object isIsolated(long n) {
		BigInteger a = BigInteger.valueOf(n).multiply(BigInteger.valueOf(n));
		if (a.longValue() > Long.MAX_VALUE) {
			return -1;
		}
		long square = a.longValue();
		BigInteger b = a.multiply(BigInteger.valueOf(n));
		if (b.longValue() > Long.MAX_VALUE) {
			return -1;
		}
		long cube = b.longValue();
		System.out.println(square + ", " + cube);
		List<Integer> aNums = toNums(square);
		List<Integer> bNums = toNums(cube);
		
		if (Collections.disjoint(aNums, bNums)) {
			return 1;
		} else {
			return 0;
		}
	}
	public List<Integer> toNums(long n) {
		ArrayList<Integer> nums = new ArrayList<>();
		do {
			nums.add((int)n%10);
			n = n/10;
		} while (n > 0);
		return nums;
	}
	
	public static void main(String[] args) {
		new Isolate().solve();
	}

}

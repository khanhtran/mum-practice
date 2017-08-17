package mum.practice.pc;

import mum.practice.Solution;

/**
 * 1. Write a method named getExponent(n, p) that returns the largest exponent x
 * such that px evenly divides n. If p is <= 1 the method should return -1. For
 * example, getExponent(162, 3) returns 4 because 162 = 21 * 34, therefore the
 * value of x here is 4. The method signature isint getExponent(int n, int p)
 * 
 * @author Khanh
 *
 */
public class Exponent extends Solution {

	public Exponent() {
		input = "";
	}
	
	@Override
	public Object solve() {
		super.solve();
		output = getExponent(27, 3);
		printResult();
		return null;
	}
	private Object getExponent(int n, int p) {		
		if (p <= 1) {
			return -1;
		}
		//log3 (162) = 4.6
		//logb(n) = loge(n)/loge(b)
		double logValue = Math.log(n)/Math.log(p);
		int start = (int)Math.floor(logValue);
		while (start >= 1) {
			if (n % Math.pow(p, start) == 0) {
				return start;
			}
			start--;
		}
		return start;
	}

	public static void main(String[] args) {
		new Exponent().solve();
	}
}

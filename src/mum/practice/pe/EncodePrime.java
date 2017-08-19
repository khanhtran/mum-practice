package mum.practice.pe;

import java.util.ArrayList;
import java.util.List;

import mum.practice.Solution;

/**
 * The fundamental theorem of arithmetic states that every natural number
 * greater than 1 can be written as a unique product of prime numbers. So, for
 * instance, 6936=2*2*2*3*17*17. Write a method named encodeNumber what will
 * encode a number n as an array that contains the prime numbers that, when
 * multipled together, will equal n. So encodeNumber(6936) would return the
 * array {2, 2, 2, 3, 17, 17}. If the number is <= 1 the function should return
 * null;
 * 
 * @author Khanh
 *
 */
public class EncodePrime extends Solution {

	public EncodePrime() {
		input = "";
	}

	@Override
	public Object solve() {
		super.solve();
		int n = 1200;
		output = encodeNumber(n);
		printResult();
		return null;
	}

	private Object encodeNumber(int n) {
		List<Integer> lst = new ArrayList<>();
		int d = 2;
		while (n > 1) {
			while (n % d == 0) {
				lst.add(d);
				n = n / d;
			}
			d++;
		}
		int p[] = new int[lst.size()];
		for (int i = 0; i < lst.size(); i++) {
			p[i] = lst.get(i);
		}
		return p;
//		return lst.toArray(new Integer[] {});
	}

	public static void main(String[] args) {
		new EncodePrime().solve();
	}

}

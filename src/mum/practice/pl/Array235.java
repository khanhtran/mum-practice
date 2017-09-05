package mum.practice.pl;

import mum.practice.Solution;

/**
 * An array is defined to be a 235 array if the number of elements divisible by
 * 2 plus the number of elements divisible by 3 plus the number of elements
 * divisible by 5 plus the number of elements not divisible by 2, 3, or 5 is
 * equal to the number of elements of the array. Write a method named is123Array
 * that returns 1 if its array argument is a 235 array, otherwise it returns 0.
 * 
 * @author Khanh
 *
 */
public class Array235 extends Solution {

	public Array235() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void solve2() {
		// TODO Auto-generated method stub
		super.solve2();
		output = is235Array(new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		printResult();
	}

	private Object is235Array(int[] a) {
		int l = a.length;
		int d2 = countDevisible(a, 2);
		int d3 = countDevisible(a, 3);
		int d5 = countDevisible(a, 5);
		int d0 = countNone(a);
		if ((d2 + d3 + d5 + d0) == l) {
			return 1;
		}
		return 0;
	}

	private int countNone(int[] a) {
		int c = 0;
		for (int e : a) {
			if (e % 2 != 0 && e % 3 != 0 && e % 5 != 0) {
				c++;
			}
		}
		return c;
	}

	private int countDevisible(int[] a, int n) {
		// TODO Auto-generated method stub
		int c = 0;
		for (int e : a) {
			if (e % n == 0) {
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Array235().solve2();
	}

}

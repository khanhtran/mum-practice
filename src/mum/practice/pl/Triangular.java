package mum.practice.pl;

import mum.practice.Solution;

/**
 * A number n is triangular if n == 1 + 2 +…+j for some j. Write a function int
 * isTriangular(int n) that returns 1 if n is a triangular number, otherwise it
 * returns 0. The first 4 triangular numbers are 1 (j=1), 3 (j=2), 6, (j=3), 10
 * (j=4).
 * 
 * @author Khanh
 *
 */
public class Triangular extends Solution {

	public Triangular() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void solve2() {
		// TODO Auto-generated method stub
		super.solve2();
		output = isTriangular(10);
		printResult();
	}

	private Object isTriangular(int n) {
		int s = 0;
		int j = 1;
		do {
			s = s + j;
			j = j + 1;
		} while (s < n);
		if (s == n) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		new Triangular().solve2();
	}

}

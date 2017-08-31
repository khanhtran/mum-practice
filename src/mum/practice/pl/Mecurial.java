package mum.practice.pl;

import mum.practice.Solution;

/**
 * Define an array to be a Mercurial array if a 3 does not occur between any two
 * 1s. Write a function named isMercurial that returns 1 if its array argument
 * is a Mercurial array, otherwise it returns 0.
 * 
 * @author Khanh
 *
 */
public class Mecurial extends Solution {

	public Mecurial() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void solve2() {
		// TODO Auto-generated method stub
		super.solve2();
		output = isMercurial(new int[]{1, 2, 10, 3, 15, 1, 2, 2});
	}
	private Object isMercurial(int[] a) {
		int i = 0, j = 0;
		do {
			i = find(i, a.length - 1, 1);
			if (i != -1) {
				j = find(i, a.length - 1, 1);
			}
		} while (i != -1 && j != -1);
		return null;
	}

	public static void main(String[] args) {
		new Mecurial().solve2();

	}

}

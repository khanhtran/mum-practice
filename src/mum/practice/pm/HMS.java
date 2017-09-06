package mum.practice.pm;

import mum.practice.Solution;

/**
 * Write a method named computeHMS that computes the number of hours, minutes
 * and seconds in a given number of seconds. If you are programming in Java or
 * C#, the method signature is int[] computeHMS(int seconds)
 * 
 * @author Khanh
 *
 */
public class HMS extends Solution {

	public HMS() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void solve2() {
		// TODO Auto-generated method stub
		super.solve2();
		output = computHMS(3735);
		printResult();
	}

	private Object computHMS(int s) {
		int h = s / 3600;
		s = s % 3600;
		int m = s / 60;
		s = s % 60;
		return new int[] { h, m, s };
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HMS().solve2();
	}

}

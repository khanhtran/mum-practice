package mum.practice.pm;

import mum.practice.Solution;

/**
 * An array is defined to be paired-N if it contains two distinct elements that
 * sum to N for some specified value of N and the indexes of those elements also
 * sum to N. Write a function named isPairedN that returns 1 if its array
 * parameter is a paired-N array, otherwise it returns 0. The value of N is
 * passed as the second parameter. If you are writing in Java or C#, the
 * function signature is int isPairedN(int[ ] a, int n) If you are writing in C
 * or C++, the function signature is int isPairedN(int a[ ], int n, int len)
 * where len is the length of a There are two additional requirements. 1. Once
 * you know the array is paired-N, you should return 1. No wasted loop
 * iterations please. 2. Do not enter the loop unless you have to. You should
 * test the length of the array and the value of n to determine whether the
 * array could possibly be a paired-N array. If the tests indicate no, return 0
 * before entering the loop
 * 
 * @author Khanh
 *
 */
public class PairedN extends Solution {

	public PairedN() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void solve2() {
		// TODO Auto-generated method stub
		super.solve2();
		output = isPairedN(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8 });
		printResult();
	}

	private Object isPairedN(int[] a) {
		if (a.length < 2) {
			return 0;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == i + j) {
					return 1;
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		new PairedN().solve2();
	}

}

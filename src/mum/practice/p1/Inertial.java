package mum.practice.p1;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import mum.practice.Solution;

public class Inertial extends Solution {
	
	public Inertial() {
		input = "4 1 2 3 4";
		input = "6 11 4 20 9 2 8";
	}
	
	@Override
	public Object solve() {		
		Scanner sc =  new Scanner(new ByteArrayInputStream(((String)input).getBytes()));
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int result = 0;
		boolean haveOdd = haveOdd(a);
		if (haveOdd) {
			int max = findMax(a);
			if ((max % 2) == 0) {
				boolean cond3 = everyOddGreaterThanEvenNotMax(a, max);
				if (cond3) {
					result = 1;
				}
			}
		}
		output = result;
		printResult();
		return result;
	}

	
	private boolean everyOddGreaterThanEvenNotMax(int[] a, int max) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				for (int j = 0; j < a.length; j++) {
					if (i != j && a[j] !=  max && a[j] % 2 == 0) {
						if (a[j] >= a[i]) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}

	private int findMax(int[] a) {
		int max = -1;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}

	private boolean haveOdd(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		new Inertial().solve();
		
	}

}

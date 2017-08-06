package mum.practice.p1;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import mum.practice.Solution;

public class Madhav extends Solution {
	
	public Madhav() {
//		input = "3 2 1 4";
//		input = "6 2 1 1 4 -1 -1";
		input = "10 6 2 4 2 2 2 1 5 0 0";
//		input = "5 3 1 2 3 0";
	}

	@Override
	public Object solve() {
		Scanner sc =  new Scanner(new ByteArrayInputStream(((String)input).getBytes()));
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		output = isMadhavArray(a);
		return output;
	}
	
	public int isMadhavArray(int[] a) {
		if (a.length < 3) {
			return 0;
		}
		int first = a[0];
		int l = 1;
		int length = 2;
		while (l < a.length) {
			int sum = getSum(a, l, length);
			System.out.println("sum " + l + ", " + length + " = " + sum);
			if (sum != first) {
				return 0;
			}
			l = l + length;
			length++;
		}
		return 1;
	}
	public int getSum(int[] a, int l, int length) {
		int sum = 0;
		int i = l;
		int r = l + length -1;
		for (;i <= r; i++) {
			if (i < a.length) {
				sum+= a[i];
			} else {
				return 0;
			}
		}
		
		return sum;
	}
	public static void main(String[] args) {
		Solution s = new Madhav();
		s.solve();
		s.printResult();
	}

}

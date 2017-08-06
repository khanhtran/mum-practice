package mum.practice.p2;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import mum.practice.Solution;

public class SquarePair extends Solution {

	public SquarePair() {
		input = "4 11 5 4 20";
	}
	@Override
	public Object solve() {
		Scanner sc =  new Scanner(new ByteArrayInputStream(((String)input).getBytes()));
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
//		loop all pairs
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if( a[i] < a[j]) {
					if (isPerfectSquare(a[i] + a[j])) {
						count++;
						System.out.println(a[i] + " " + a[j]);
					}
				}
			}
		}
		output = count;
		this.printResult();
		return count;
	}
	
	private boolean isPerfectSquare(int i) {
		double d = Math.sqrt(i);
		if ((d == Math.floor(d)) && !Double.isInfinite(d)) {
		    return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Solution s = new SquarePair();
		s.solve();
	}

}	

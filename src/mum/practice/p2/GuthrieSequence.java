package mum.practice.p2;

import java.awt.DisplayMode;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

import mum.practice.Solution;

public class GuthrieSequence extends Solution {
	
	public GuthrieSequence() {
		input = "17 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1";
	}
	@Override
	public Object solve() {
		Scanner sc =  new Scanner(new ByteArrayInputStream(((String)input).getBytes()));
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		output = isGuthrieSequence(a);
		printResult();
		return null;
	}
	
	private Object isGuthrieSequence(int[] a) {
		int i = 0;
		int n = a[i];
		i++;
		while (n > 1 && i < a.length) {			
			int m;
			if (n %2 == 0) {
				m = n/2;
			} else {
				m = n*3 + 1; 
			}
			if (a[i] != m) {
				return 0;
			}
			n = m;
			i++;
//			System.out.println(i + ", " + n + ", " + m);
		}
		if (n == 1 && i == a.length) {
			return 1;
		} else {
			return 0;
		}
	}
	public static void main(String[] args) {
		new GuthrieSequence().solve();
	}

}

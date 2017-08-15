package mum.practice;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Solution {
	protected Object input;
	protected Object output;
	protected Scanner sc;
	public Solution() {
		
	}
	public Object solve() {
		sc = new Scanner(new ByteArrayInputStream(input.toString().getBytes()));
		return null;
	}

	public void printResult() {		
		if (output instanceof int[]) {
			int[] a = (int[]) output;
			System.out.println("");
			for (int i = 0; i < a.length; i++) {
				
				System.out.print(a[i]);
				if (i < a.length - 1 ) {
					System.out.print(", ");
				}
			}
		} else {
			System.out.println(output);
		}
		
	}

	public int[] readArray() {
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}
}

package mum.practice.p3;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import mum.practice.Solution;

public class GuthrieIndex extends Solution {

	public GuthrieIndex() {
		input = "7";
	}

	@Override
	public Object solve() {
		Scanner sc = new Scanner(new ByteArrayInputStream(input.toString().getBytes()));
		int n = sc.nextInt();
		output = calculateIndex(n);
		printResult();
		return null;
	}

	private Object calculateIndex(int n) {
		int count = 0;
		while (n > 1) {
			if (n % 2 != 0) {
				n = n*3 + 1;
			} else {
				n = n/2;
			}
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		new GuthrieIndex().solve();
	}

}

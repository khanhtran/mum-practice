package mum.practice.p3;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import mum.practice.Solution;

public class Stanton extends Solution {
	public Stanton() {
		input = "8 1 4 3 2 1 2 3 2";
	}
	@Override
	public Object solve() {
		Scanner sc = new Scanner(new ByteArrayInputStream(input.toString().getBytes()));
		int k = sc.nextInt();
		int[] a = new int[k];
		for (int i = 0; i < k; i++) {
			a[i] = sc.nextInt();
		}
		output = stantonMeasure(a);
		printResult();
		return null;
	}

	private Object stantonMeasure(int[] a) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				int count = map.get(a[i]);
				map.put(a[i], count + 1);
			} else {
				map.put(a[i], 1);
			}
		}
		int n = map.get(1);
		output = map.get(n);
		return output;
	}
	public static void main(String[] args) {
		new Stanton().solve();
	}

}

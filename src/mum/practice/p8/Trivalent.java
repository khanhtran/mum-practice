package mum.practice.p8;

import java.util.ArrayList;
import java.util.List;

import mum.practice.Solution;

public class Trivalent extends Solution {

	public Trivalent() {
		input = "9 22 19 10 10 19 22 22 10 11";
	}
	@Override
	public Object solve() {
		super.solve();
		int [] a = readArray();
		output = isTrivalent(a);
		printResult();
		return null;
	}
	private Object isTrivalent(int[] a) {
		List<Integer> lst = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (!lst.contains(a[i])) {
				lst.add(a[i]);
			}
		}
		return lst.size() == 3 ? 1 : 0;
	}
	public static void main(String[] args) {
		new Trivalent().solve();
	}
}

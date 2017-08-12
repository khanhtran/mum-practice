package mum.practice.p3;

import java.util.HashMap;
import java.util.Map;

import mum.practice.Solution;

public class SumFactor extends Solution {

	public SumFactor() {
		input = "7 1 -1 1 -1 1 -1 1";
	}

	@Override
	public Object solve() {
		super.solve();
		int[] a = readArray();
		output = sumFactor(a);
		printResult();
		return null;
	}

	private Object sumFactor(int[]a) {
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			int t = a[i];
			sum += t;
			if (map.containsKey(t)) {
				int count = map.get(t);
				count++;
				map.put(t, count);
			} else {
				map.put(t, 1);
			}
		}
		if (map.containsKey(sum)) {
			return map.get(sum);
		} else {
			return 0;
		}
		
	}

	public static void main(String[] args) {
		new SumFactor().solve();

	}

}

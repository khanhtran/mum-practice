package mum.practice.p7;

import java.util.HashMap;
import java.util.Map;

import mum.practice.Solution;

/**
 * 
 * @author Khanh Define an array to be sum-safe if none of its elements is equal
 *         to the sum of its elements. The array a = {5, -5, 0} is not sum-safe
 *         because the sum of its elements is 0 and a[2] == 0. However, the
 *         array a = {5, -2, 1} is sum-safe because the sum of its elements is 4
 *         and none of its elements equal 4.
 */
public class SumSafe extends Solution {

	public SumSafe() {
		input = "3 5 -2 1";
	}

	@Override
	public Object solve() {
		super.solve();
		int[] a = readArray();
		output = isSumSafe(a);
		printResult();
		return null;
	}

	private Object isSumSafe(int[] a) {
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			if (map.containsKey(a[i])) {
				int count = map.get(a[i]);
				map.put(a[i], count + 1);
			} else {
				map.put(a[i], 1);
			}
		}
		return map.containsKey(sum) ? 0 : 1;
	}

	public static void main(String[] args) {
		new SumSafe().solve();
	}
}

package mum.practice.p9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import mum.practice.Solution;

/**
 * An integer array is defined to be sequentially-bounded if it is in ascending
 * order and each value, n, in the array occurs less than n times in the array.
 * So {2, 3, 3, 99, 99, 99, 99, 99} is sequentially-bounded because it is in
 * ascending order and the value 2 occurs less than 2 times, the value 3 occurs
 * less than 3 times and the value 99 occurs less than 99 times. On the other
 * hand, the array {1, 2, 3} is not sequentially-bounded because the value 1
 * does not occur < 1 times. The array {2, 3, 3, 3, 3} is not
 * sequentially-bounded because the maximum allowable occurrences of 3 is 2 but
 * 3 occurs 4 times. The array {12, 12, 9} is not sequentially-bounded because
 * it is not in ascending order
 * 
 * @author Khanh
 *
 */
public class SequentiallyBounded extends Solution {

	public SequentiallyBounded() {
		input = "8 1 3 3 99 99 99 99 99";
	}

	@Override
	public Object solve() {
		super.solve();
		int[] a = readArray();
		output = isSequentiallyBounded(a);
		printResult();
		return null;
	}

	private Object isSequentiallyBounded(int[] a) {
		boolean p = isOrderedAsc(a);
		boolean q = isBounded(a);
		return (p && q) ? 1 : 0;
	}

	private boolean isBounded(int[] a) {
		Map<Integer, Integer> elemMap = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (elemMap.containsKey(a[i])) {
				int count = elemMap.get(a[i]);
				elemMap.put(a[i], count + 1);
			} else {
				elemMap.put(a[i], 1);
			}
		}
		Iterator<Integer> it = elemMap.keySet().iterator();
		while (it.hasNext()) {
			int num = it.next();
			int count = elemMap.get(num);
			if (count >= num) {
				return false;
			}
		}
		return true;
	}

	private boolean isOrderedAsc(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i - 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		new SequentiallyBounded().solve();
	}

}

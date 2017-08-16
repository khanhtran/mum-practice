package mum.practice.pb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import mum.practice.Solution;

/**
 * Define an array to be packed if all its values are positive, each value n
 * appears n times and all equal values are in consecutive locations. So for
 * example, {2, 2, 3, 3, 3} is packed because 2 appears twice and 3 appears
 * three times. But {2, 3, 2, 3, 3} is not packed because the 2s are not in
 * consecutive locations. And {2, 2, 2, 3, 3, 3} is not packed because 2 appears
 * three times.
 * 
 * @author Khanh
 *
 */
public class Packed extends Solution {

	public Packed() {
//		input = "5 2 2 3 3 3";
		input = "5 2 3 2 3 3";
	}
	
	@Override
	public Object solve() {
		super.solve();
		int [] a= readArray();
		output = isPacked(a);
		printResult();
		return null;
	}

	private Object isPacked(int[] a) {
		Map<Integer, Integer> elemCount = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				return 0;
			}
			if (elemCount.containsKey(a[i])) {
				int count = elemCount.get(a[i]);
				elemCount.put(a[i], count + 1);
			} else {
				elemCount.put(a[i], 1);
			}
		}
		
		Iterator<Integer> it = elemCount.keySet().iterator();
		while (it.hasNext()) {
			int key = it.next();
			int val = elemCount.get(key);
			if (key != val) {
				return 0;
			}
		}
		List <Integer> checked = new ArrayList<>();
		int prevVal = -1;
		for (int i = 0; i < a.length; i++) {
			if (prevVal != -1 && a[i] != prevVal) {
//				new chunk
				if (checked.contains(a[i])) {
					return 0;
				}
			}
			prevVal = a[i];
			if (!checked.contains(a[i])) {
				checked.add(a[i]);
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		new Packed().solve();
	}

}

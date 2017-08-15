package mum.practice.p9;

import java.util.HashMap;
import java.util.Map;

import mum.practice.Solution;

/**
 * a. The minimum and maximum values of the array are not equal. 
 * b. The minimum and maximum values of the array are not adjacent to one another. 
 * c. The minimum value occurs exactly once in the array. 
 * d. The maximum value occurs exactly once in the array
 * 
 * @author Khanh
 *
 */
public class MinmaxDisjoint extends Solution {

	public MinmaxDisjoint() {
		input = "5 5 4 1 3 2";
	}

	@Override
	public Object solve() {
		super.solve();
		int[] a = readArray();
		output = isMinmaxDisjoint(a);
		printResult();
		return null;
	}

	private Object isMinmaxDisjoint(int[] a) {
		int minIndex = -1, maxIndex = -1;
		Map<Integer, Integer> elemMap = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (minIndex == -1 || a[i] < a[minIndex]) {
				minIndex = i;
			}
			if (maxIndex == -1 || a[i] > a[maxIndex]) {
				maxIndex = i;
			}
			if (elemMap.containsKey(a[i])) {
				int count = elemMap.get(a[i]);
				elemMap.put(a[i], count + 1);
			} else {
				elemMap.put(a[i], 1);
			}
		}
		if (a[minIndex] != a[maxIndex]) {
			if (Math.abs(minIndex - maxIndex) > 1) {
				if (elemMap.get(a[minIndex]) == 1) {
					if (elemMap.get(a[maxIndex]) == 1) {
						return 1;
					}
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		new MinmaxDisjoint().solve();
	}

}

package p07;

import java.util.HashMap;
import java.util.Map;

public class SumFactor {

	public SumFactor() {
		// TODO Auto-generated constructor stub
	}

	int sumFactor(int[] a) {
		Map<Integer, Integer> elemMap = new HashMap<>();
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			if (elemMap.containsKey(a[i])) {
				count = elemMap.get(a[i]);
			}
			count++;
			elemMap.put(a[i], count);

			sum += a[i];
		}
		return count(sum, elemMap);
	}

	private int count(int elem, Map<Integer, Integer> elemMap) {
		int count = 0;
		if (elemMap.containsKey(elem)) {
			count = elemMap.get(elem);
		}
		return count;

	}

	public static void main(String[] args) {
		assert new SumFactor().sumFactor(new int[] { 3, 0, 2, -5, 0 }) == 2;
		assert new SumFactor().sumFactor(new int[] { 9, -3, -3, -1, -1 }) == 0;
		assert new SumFactor().sumFactor(new int[] { 1 }) == 1;
		assert new SumFactor().sumFactor(new int[] { 0, 0, 0 }) == 3;

	}

}

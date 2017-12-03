package p07;

import java.util.HashMap;
import java.util.Map;

public class Stanton {

	public Stanton() {
		// TODO Auto-generated constructor stub
	}

	int stantonMeasure(int a[]) {
		Map<Integer, Integer> elemMap = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			if (elemMap.containsKey(a[i])) {
				count = elemMap.get(a[i]);
			}
			count++;
			elemMap.put(a[i], count);
		}
		int c1 = count(1, elemMap);
		int cn = count(c1, elemMap);
		return cn;
	}

	private int count(int elem, Map<Integer, Integer> elemMap) {
		int count = 0;
		if (elemMap.containsKey(elem)) {
			count = elemMap.get(elem);
		}
		return count;
	}

	public static void main(String[] args) {
		assert new Stanton().stantonMeasure(new int[] { 1 }) == 1;
		assert new Stanton().stantonMeasure(new int[] { 0 }) == 1;
		assert new Stanton().stantonMeasure(new int[] { 3, 1, 1, 4 }) == 0;
		assert new Stanton().stantonMeasure(new int[] { 1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4 }) == 6;
		assert new Stanton().stantonMeasure(new int[] {}) == 0;
	}

}

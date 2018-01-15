package p25;

import java.util.HashMap;
import java.util.Map;

public class MinMax {

	public MinMax() {
		// TODO Auto-generated constructor stub
	}

	int isMinMaxDisjoint(int[] a) {
		if (a.length <= 1) {
			return 0;
		}
		int max = 0, min = 0, iMax = -1, iMin = -1;
		Map<Integer, Integer> elemCount = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (i == 0 || a[i] > max) {
				max = a[i];
				iMax = i;
			}
			if (i == 0 || a[i] < min) {
				min = a[i];
				iMin = i;
			}

			if (elemCount.containsKey(a[i])) {
				int count = elemCount.get(a[i]);
				elemCount.put(a[i], count + 1);
			} else {
				elemCount.put(a[i], 1);
			}
		}

		if (max == min) {
			return 0;
		}

		if (Math.abs(iMax - iMin) == 1) {
			return 0;
		}

		if (elemCount.get(max) != 1) {
			return 0;
		}

		if (elemCount.get(min) != 1) {
			return 0;
		}
		
		return 1;
	}

	public static void main(String[] args) {
		assert new MinMax().isMinMaxDisjoint(new int[] { 5, 4, 1, 3, 2 }) == 1;
		assert new MinMax().isMinMaxDisjoint(new int[] { 18, -1, 3, 4, 0 }) == 0;
		assert new MinMax().isMinMaxDisjoint(new int[] { 9, 0, 5, 9 }) == 0;
		assert new MinMax().isMinMaxDisjoint(new int[] { 0, 5, 18, 0, 9 }) == 0;
		assert new MinMax().isMinMaxDisjoint(new int[] { 7, 7, 7, 7 }) == 0;
		assert new MinMax().isMinMaxDisjoint(new int[] {}) == 0;
		assert new MinMax().isMinMaxDisjoint(new int[] { 1, 2 }) == 0;
		assert new MinMax().isMinMaxDisjoint(new int[] { 1 }) == 0;
		System.out.println("Done");
	}

}

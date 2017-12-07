package p13;

import java.util.HashMap;
import java.util.Map;

public class NUnique {

	public NUnique() {
		// TODO Auto-generated constructor stub
	}

	int isNUnique(int[] a, int n) {
		Map<Integer, Integer> itemMap = toMap(a);
		int pairCount = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= n) {
				int k = n - a[i];
				if (itemMap.containsKey(k)) {
					pairCount++;
				}
			}
		}

		if (pairCount == 2) {
			return 1;
		} else {
			return 0;
		}
	}

	private Map<Integer, Integer> toMap(int[] a) {
		Map<Integer, Integer> itemMap = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (!itemMap.containsKey(a[i])) {
				itemMap.put(a[i], 1);
			} else {
				int val = itemMap.get(a[i]);
				val++;
				itemMap.put(a[i], val);
			}
		}
		return itemMap;
	}

	public static void main(String[] args) {
		assert new NUnique().isNUnique(new int[] { 7, 3, 3, 2, 4 }, 6) == 0;
		assert new NUnique().isNUnique(new int[] { 7, 3, 3, 2, 4 }, 10) == 0;
		assert new NUnique().isNUnique(new int[] { 7, 3, 3, 2, 4 }, 11) == 1;
		assert new NUnique().isNUnique(new int[] { 7, 3, 3, 2, 4 }, 8) == 0;
		assert new NUnique().isNUnique(new int[] { 7, 3, 3, 2, 4 }, 4) == 0;
		assert new NUnique().isNUnique(new int[] { 7 }, 2) == 0;
		System.out.println("Done");

	}

}

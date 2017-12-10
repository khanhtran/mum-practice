package p24;

import java.util.HashMap;
import java.util.Map;

public class SequentiallyBounded {

	public SequentiallyBounded() {
		// TODO Auto-generated constructor stub
	}

	int isSequentiallyBounded(int[] a) {
		if (!isAsc(a)) {
			return 0;
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				int count = map.get(a[i]);
				map.put(a[i], count + 1);
			} else {
				map.put(a[i], 1);
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				return 0;
			}

			if (map.containsKey(a[i]) && map.get(a[i]) >= a[i]) {
				return 0;
			}
		}

		return 1;
	}

	private boolean isAsc(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i - 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		assert new SequentiallyBounded().isSequentiallyBounded(new int[] { 0, 1 }) == 0;
		assert new SequentiallyBounded().isSequentiallyBounded(new int[] { -1, 2 }) == 0;
		assert new SequentiallyBounded().isSequentiallyBounded(new int[] {}) == 1;
		assert new SequentiallyBounded().isSequentiallyBounded(new int[] { 5, 5, 5, 5 }) == 1;
		assert new SequentiallyBounded().isSequentiallyBounded(new int[] { 5, 5, 5, 2, 5 }) == 0;
		System.out.println("Done");
	}

}

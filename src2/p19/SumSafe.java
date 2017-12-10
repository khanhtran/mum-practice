package p19;

import java.util.HashMap;
import java.util.Map;

public class SumSafe {

	public SumSafe() {
		// TODO Auto-generated constructor stub
	}

	int isSumSafe(int[] a) {
		int sum = 0;
		Map<Integer, Integer> elemMap = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			if (!elemMap.containsKey(a[i])) {
				elemMap.put(a[i], 1);
			}
		}
		if (elemMap.containsKey(sum)) {
			return 0;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		assert new SumSafe().isSumSafe(new int[] { 5, -5, 0 }) == 0;
		assert new SumSafe().isSumSafe(new int[] { 5, -2, 1 }) == 1;
		System.out.println("Done");
	}

}

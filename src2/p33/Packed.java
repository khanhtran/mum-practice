package p33;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Packed {

	public Packed() {
		// TODO Auto-generated constructor stub
	}

	int isPacked(int[] a) {
		Map<Integer, Integer> elemCounts = new HashMap<>();
		// positive
		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			if (n <= 0) {
				return 0;
			}
			if (!elemCounts.containsKey(n)) {
				elemCounts.put(n, 1);
			} else {
				int count = elemCounts.get(n);
				elemCounts.put(n, count + 1);
			}
		}
		// number of occurence
		for (Map.Entry<Integer, Integer> entry : elemCounts.entrySet()) {
			if (entry.getValue() != entry.getKey()) {
				return 0;
			}
		}
		// elems in consecutive location
		List<Integer> chunks = new ArrayList<>();
		int current = -1;
		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			if (current == -1) {
				current = n;
				chunks.add(n);
			} else {
				if (current != n) {
					// change chunk
					if (chunks.contains(n)) {
						return 0;
					} else {
						current = n;
						chunks.add(n);
					}
				}
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		assert new Packed().isPacked(new int[] { 2, 2, 1 }) == 1;
		assert new Packed().isPacked(new int[] { 2, 2, 1, 2, 2 }) == 0;
		assert new Packed().isPacked(new int[] { 4, 4, 4, 4, 1, 2, 2, 3, 3, 3 }) == 1;
		assert new Packed().isPacked(new int[] { 7, 7, 7, 7, 7, 7, 7, 1 }) == 1;
		assert new Packed().isPacked(new int[] { 7, 7, 7, 7, 1, 7, 7, 7 }) == 0;
		assert new Packed().isPacked(new int[] { 7, 7, 7, 7, 7, 7, 7 }) == 1;
		assert new Packed().isPacked(new int[] {}) == 1;
		System.out.println("Done");

	}

}

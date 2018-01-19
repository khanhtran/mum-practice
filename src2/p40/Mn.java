package p40;

import java.util.ArrayList;
import java.util.List;

public class Mn {

	public Mn() {
		// TODO Auto-generated constructor stub
	}

	int isSequencedArray(int[] a, int m, int n) {
		List<Integer> lst = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			lst.add(a[i]);
		}
		// contains all elems [m,n]
		for (int i = m; i <= n; i++) {
			if (!lst.contains(i)) {
				return 0;
			}
		}

		// asc
		for (int i = 1; i < a.length - 1; i++) {
			if (a[i] < a[i - 1]) {
				return 0;
			}
		}
		// only from [m,n]
		for (int i = 0; i < a.length; i++) {
			if (a[i] < m || a[i] > n) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		assert new Mn().isSequencedArray(new int[] { 1, 2, 3, 4, 5 }, 1, 5) == 1;
		assert new Mn().isSequencedArray(new int[] { 1, 3, 4, 2, 5 }, 1, 5) == 0;
		assert new Mn().isSequencedArray(new int[] { -5, -5, -4, -4, -4, -3, -3, -2, -2, -2 }, -5, -2) == 1;
		assert new Mn().isSequencedArray(new int[] { 0, 1, 2, 3, 4, 5 }, 1, 5) == 0;
		assert new Mn().isSequencedArray(new int[] { 1, 2, 3, 4 }, 1, 5) == 0;
		assert new Mn().isSequencedArray(new int[] { 1, 2, 5 }, 1, 5) == 0;
		assert new Mn().isSequencedArray(new int[] { 5, 4, 3, 2, 1 }, 1, 5) == 0;
		System.out.println("Done");

	}

}

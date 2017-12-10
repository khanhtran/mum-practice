package p22;

import java.util.ArrayList;
import java.util.List;

public class Trivalent {

	public Trivalent() {
		// TODO Auto-generated constructor stub
	}

	int isTrivalent(int[] a) {
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (!arr.contains(a[i])) {
				arr.add(a[i]);
			}
		}
		return arr.size() == 3 ? 1 : 0;
	}

	public static void main(String[] args) {
		assert new Trivalent().isTrivalent(new int[] { -1, 0, 1, 0, 0, 0 }) == 1;
		assert new Trivalent().isTrivalent(new int[] {}) == 0;
		assert new Trivalent().isTrivalent(new int[] { 2147483647, -1, -1, -2147483648 }) == 1;
		System.out.println("Done");
	}

}

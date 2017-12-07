package p17;

public class Matcher {

	public Matcher() {
		// TODO Auto-generated constructor stub
	}

	int matches(int[] a, int[] p) {
		int start = 0;
		for (int i = 0; i < p.length; i++) {
			if (!matchPart(a, start, p[i])) {
				return 0;
			}
			start = start + Math.abs(p[i]);
		}
		if (start == a.length) {
			return 1;
		} else {
			return 0;
		}
	}

	private boolean matchPart(int[] a, int start, int p) {
		int l = Math.abs(p);
		int end = start + l;
		if (end > a.length) {
			return false;
		}
		for (int i = start; i < end; i++) {
			if (p > 0 && a[i] < 0) {
				return false;
			}
			if (p < 0 && a[i] > 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		assert new Matcher().matches(new int[] { 1, 2, 3, -5, -5, 2, 3, 18 }, new int[] { 3, -2, 3 }) == 1;
		assert new Matcher().matches(new int[] { 1, 2, 3, -5, -5, 2, 3, 18 }, new int[] { 2, 1, -1, -1, 2, 1 }) == 1;
		assert new Matcher().matches(new int[] { 1, 2, 3, -5, -5, 2, 3, 18 }, new int[] { 1, 2, -1, -1, 1, 2 }) == 1;
		assert new Matcher().matches(new int[] { 1, 2, 3, -5, -5, 2, 3, 18 }, new int[] { 2, 1, -2, 3 }) == 1;
		assert new Matcher().matches(new int[] { 1, 2, 3, -5, -5, 2, 3, 18 },
				new int[] { 1, 1, 1, -1, -1, 1, 1, 1 }) == 1;

		assert new Matcher().matches(new int[] { 1, 2, 3, -5, -5, 2, 3, 18 }, new int[] { 4, -1, 3 }) == 0;
		assert new Matcher().matches(new int[] { 1, 2, 3, -5, -5, 2, 3, 18 }, new int[] { 2, -3, 3 }) == 0;
		assert new Matcher().matches(new int[] { 1, 2, 3, -5, -5, 2, 3, 18 }, new int[] { 8 }) == 0;
		
		System.out.println("Done");
	}

}

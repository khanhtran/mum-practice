package p46;

public class Zero {

	public Zero() {
		// TODO Auto-generated constructor stub
	}

	int isZeroPlentiful(int[] a) {
		int numChunks = 0;
		for (int i = 0; i < a.length;) {
			int k = i;
			boolean chunk = false;
			while (k < a.length && a[k] == 0) {
				chunk = true;
				k++;
			}
			if ((k - i) >= 4) {
				numChunks++;
			} else {
				if (chunk) {
					return 0;
				}
			}
			i = k + 1;
		}
		return numChunks;
	}

	public static void main(String[] args) {
		assert new Zero().isZeroPlentiful(new int[] { 0, 0, 0, 0, 0 }) == 1;
		assert new Zero().isZeroPlentiful(new int[] { 1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12 }) == 2;
		assert new Zero().isZeroPlentiful(new int[] { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0 }) == 3;
		assert new Zero().isZeroPlentiful(new int[] { 1, 2, 3, 4 }) == 0;
		assert new Zero().isZeroPlentiful(new int[] { 1, 0, 0, 0, 2, 0, 0, 0, 0 }) == 0;
		assert new Zero().isZeroPlentiful(new int[] { 0 }) == 0;
		assert new Zero().isZeroPlentiful(new int[] {}) == 0;
		System.out.println("Done");

	}

}

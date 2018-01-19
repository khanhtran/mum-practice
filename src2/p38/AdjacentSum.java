package p38;

public class AdjacentSum {

	public AdjacentSum() {
		// TODO Auto-generated constructor stub
	}

	int largestAdjacentSum(int[] a) {
		if (a.length < 2) {
			return 0;
		}

		int max = -1;
		for (int i = 0; i < a.length - 1; i++) {
			if (i == 0) {
				max = a[i] + a[i + 1];
			} else {
				max = Math.max(max, a[i] + a[i + 1]);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		assert new AdjacentSum().largestAdjacentSum(new int[] { 1, 2, 3, 4 }) == 7;
		assert new AdjacentSum().largestAdjacentSum(new int[] { 18, -12, 9, -10 }) == 6;
		assert new AdjacentSum().largestAdjacentSum(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 }) == 2;
		assert new AdjacentSum().largestAdjacentSum(new int[] { 1, 1, 1, 1, 1, 2, 1, 1, 1 }) == 3;
		System.out.println("Done");
	}

}

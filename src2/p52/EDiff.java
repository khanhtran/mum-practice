package p52;

public class EDiff {

	public EDiff() {
		// TODO Auto-generated constructor stub
	}

	int largestDifferenceOfEvens(int[] a) {
		int minEven = Integer.MAX_VALUE;
		int maxEven = Integer.MIN_VALUE;
		boolean haveMaxEven = false;
		boolean haveMinEven = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				if (a[i] < minEven) {
					minEven = a[i];
					haveMinEven = true;
				}
				if (a[i] > maxEven) {
					maxEven = a[i];
					haveMaxEven = true;
				}
			}
		}
		if (haveMinEven && haveMaxEven) {
			return maxEven - minEven;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		assert new EDiff().largestDifferenceOfEvens(new int[] { 1, 3, 5, 9 }) == -1;
		assert new EDiff().largestDifferenceOfEvens(new int[] { 2,2,2,2 }) == 0;
		assert new EDiff().largestDifferenceOfEvens(new int[] { 1, 2, 1, 2, 1, 4, 1, 6, 4}) == 4;
		System.out.println("Done");
	}

}

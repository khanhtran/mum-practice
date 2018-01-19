package p36;

public class Array121 {

	public Array121() {
		// TODO Auto-generated constructor stub
	}

	int is121Array(int[] a) {
		if (a.length < 1) {
			return 0;
		}
		if (a[0] != 1) {
			return 0;
		}

		int start = 0;
		int end = a.length - 1;

		while (start <= end) {
			if (a[start] == 1) {
				if (a[end] != 1) {
					return 0;
				}
			} else if (a[start] == 2) {
				for (int i = start; i <= end; i++) {
					if (a[i] != 2) {
						return 0;
					}
				}
				// all 2 middle
				return 1;
			} else {
				return 0;
			}
			start++;
			end--;
		}
		return 0;
	}

	public static void main(String[] args) {
		assert new Array121().is121Array(new int[] { 1, 2, 1 }) == 1;
		assert new Array121().is121Array(new int[] { 1, 1, 2, 2, 2, 1, 1 }) == 1;
		assert new Array121().is121Array(new int[] { 1, 1, 2, 2, 2, 1, 1, 1 }) == 0;
		assert new Array121().is121Array(new int[] { 1, 1, 2, 1, 2, 1, 1 }) == 0;
		assert new Array121().is121Array(new int[] { 1, 1, 1, 2, 2, 2, 1, 1, 1, 3 }) == 0;
		assert new Array121().is121Array(new int[] { 1, 1, 1, 1, 1, 1 }) == 0;
		assert new Array121().is121Array(new int[] { 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1 }) == 0;
		System.out.println("Done");

	}

}

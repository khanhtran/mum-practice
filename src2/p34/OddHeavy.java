package p34;

public class OddHeavy {

	public OddHeavy() {
		// TODO Auto-generated constructor stub
	}

	int isOddHeavy(int a[]) {
		// 1. contains at least one odd element
		boolean odd = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				odd = true;
				break;
			}
		}
		if (!odd) {
			return 0;
		}
		boolean noEven = true;
		int maxEven = -1;
		// 2. every element
		// whose value is odd is greater than every even-valued element
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				if (noEven) {
					maxEven = a[i];
					noEven = false;
				} else {
					maxEven = Math.max(maxEven, a[i]);
				}
			}
		}
		if (!noEven) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 != 0) {
					if (a[i] <= maxEven) {
						return 0;
					}
				}
			}
		}

		return 1;
	}

	public static void main(String[] args) {
		assert new OddHeavy().isOddHeavy(new int[] { 1 }) == 1;
		assert new OddHeavy().isOddHeavy(new int[] { 2 }) == 0;
		assert new OddHeavy().isOddHeavy(new int[] { 1, 1, 1, 1, 1, 1 }) == 1;
		assert new OddHeavy().isOddHeavy(new int[] { 2, 4, 6, 8, 11 }) == 1;
		assert new OddHeavy().isOddHeavy(new int[] {-2, -4, -6, -8, -11 }) == 0;
		System.out.println("Done");
	}

}

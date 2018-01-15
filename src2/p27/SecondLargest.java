package p27;

public class SecondLargest {

	public SecondLargest() {
		// TODO Auto-generated constructor stub
	}

	int f(int[] a) {
		int max1 = -1, max2 = -1;
		for (int i = 0; i < a.length; i++) {
			int x = a[i];
			if (x > max1) {
				max2 = max1;
				max1 = x;
			} else if (x < max1 && x > max2) {
				max2 = x;
			}
		}
		return max2;
	}

	public static void main(String[] args) {
		assert new SecondLargest().f(new int[] { 1, 2, 3, 4 }) == 3;
		assert new SecondLargest().f(new int[] { 4, 2, 1, 3 }) == 3;
		assert new SecondLargest().f(new int[] { 1, 1 }) == -1;
		assert new SecondLargest().f(new int[] {}) == -1;
		System.out.println("Done");
	}

}

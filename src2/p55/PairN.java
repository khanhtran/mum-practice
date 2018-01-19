package p55;

public class PairN {

	public PairN() {
		// TODO Auto-generated constructor stub
	}

	int isPairedN(int[] a, int n) {
		if (a.length < 2 || n <= 0) {
			return 0;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] != a[j] && a[i] + a[j] == i + j) {
					if (n == i + j) {
						return 1;
					}
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		assert new PairN().isPairedN(new int[] { 1, 4, 1, 4, 5, 6 }, 5) == 1;
		assert new PairN().isPairedN(new int[] { 1, 4, 1, 4, 5, 6 }, 6) == 1;
		assert new PairN().isPairedN(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8 }, 6) == 1;
		assert new PairN().isPairedN(new int[] { 1, 4, 1 }, 5) == 0;
		assert new PairN().isPairedN(new int[] { 8, 8, 8, 8, 7, 7, 7 }, 15) == 0;
		assert new PairN().isPairedN(new int[] { 8, -8, 8, 8, 7, 7, -7 }, -15) == 0;
		assert new PairN().isPairedN(new int[] { 3 }, 3) == 0;
		System.out.println("Done");
	}

}

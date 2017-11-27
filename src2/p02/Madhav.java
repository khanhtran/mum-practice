package p02;

public class Madhav {

	public Madhav() {
		// TODO Auto-generated constructor stub
	}

	public int isMadhavArray(int[] a) {
		if (a.length == 0) {
			return 0;
		}
		int sum = a[0];
		int i = 1;
		int l = 2;
		while ((i + l) <= a.length) {
			if (sum != sumChunk(a, i, l)) {
				return 0;
			}
			i+= l;
			l++;
		}
		if (i < (a.length - 1)) {
			return 0;
		}
		return 1;
	}

	private int sumChunk(int[] a, int i, int l) {
		int s = 0;
		for (int j = i; j < i + l; j++) {
			s += a[j];
		}
		return s;
	}

	public static void main(String[] args) {
		assert new Madhav().isMadhavArray(new int[] { 2, 1, 1 }) == 1;
		assert new Madhav().isMadhavArray(new int[] { 2, 1, 1, 4, -1, -1 }) == 1;
		assert new Madhav().isMadhavArray(new int[] { 6, 2, 4, 2, 2, 2, 1, 5, 0, 0 }) == 1;
		assert new Madhav().isMadhavArray(new int[] { 18, 9, 10, 6, 6, 6 }) == 0;
		assert new Madhav().isMadhavArray(new int[] { -6, -3, -3, 8, -5, -4 }) == 0;
		assert new Madhav().isMadhavArray(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1 }) == 1;
		assert new Madhav().isMadhavArray(new int[] { 3, 1, 2, 3, 0 }) == 0;
	}

}

package p06;

public class Guthrie {

	public Guthrie() {
		// TODO Auto-generated constructor stub
	}

	public int isGuthrieSequence(int[] a) {
		if (a.length < 2) {
			return 0;
		}

		int i = 1;
		do {
			int prev = a[i - 1];
			int curr = a[i];
			if (curr != nextVal(prev)) {
				return 0;
			}
			if (curr == 1) {
				break;
			}
			i++;
		} while (i < a.length);
		if (i == a.length - 1) {
			return 1;
		}
		return 0;
	}

	private int nextVal(int prev) {
		if (prev % 2 == 0) {
			return prev / 2;
		} else {
			return prev * 3 + 1;
		}
	}

	public static void main(String[] args) {
		assert new Guthrie().isGuthrieSequence(new int[] { 8, 4, 2, 1 }) == 1;
		assert new Guthrie().isGuthrieSequence(new int[] { 8, 17, 4, 1 }) == 0;
		assert new Guthrie().isGuthrieSequence(new int[] { 8, 4, 1 }) == 0;
		assert new Guthrie().isGuthrieSequence(new int[] { 8, 4, 2, 2 }) == 0;
	}

}

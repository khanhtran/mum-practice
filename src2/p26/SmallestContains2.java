package p26;

public class SmallestContains2 {

	public SmallestContains2() {
		// TODO Auto-generated constructor stub
	}

	int smallest(int n) {
		int k = 124;
		while (true) {
			int i = 1;
			for (; i <= n; i++) {
				int m = k * i;
				if (!containsDigit(m, 2)) {
					break;
				}
			}
			if (i > n) {
				return k;
			}
			k++;
		}
	}

	private boolean containsDigit(int m, int d) {
		while (m > 0) {
			int i = m % 10;
			if (i == d) {
				return true;
			}
			m = m / 10;
		}
		return false;
	}

	public static void main(String[] args) {
		assert new SmallestContains2().smallest(3) == 124;
		assert new SmallestContains2().smallest(4) == 624;
		assert new SmallestContains2().smallest(5) == 624;
		assert new SmallestContains2().smallest(6) == 642;
		assert new SmallestContains2().smallest(7) == 4062;

		System.out.println("Done");
	}

}

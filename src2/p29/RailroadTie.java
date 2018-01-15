package p29;

public class RailroadTie {

	public RailroadTie() {
		// TODO Auto-generated constructor stub
	}

	int isRailroadTie(int[] a) {
		int nonZeroCount = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				nonZeroCount++;
				if (i == 0) {
					if (i < a.length - 1) {
						if (a[i + 1] == 0) {
							return 0;
						}
					}
				} else {
					if (a[i - 1] == 0) {
						if (i < a.length - 1) {
							if (a[i + 1] == 0) {
								return 0;
							}
						}
					} else {
						if (i < a.length - 1) {
							if (a[i + 1] != 0) {
								return 0;
							}
						}
					}
				}
			} else {
				if (i == 0 || i == a.length - 1) {
					return 0;
				}
				if (a[i - 1] * a[i + 1] == 0) {
					return 0;
				}
			}
		}
		if (nonZeroCount == 0) {
			return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		assert new RailroadTie().isRailroadTie(new int[] { 1, 2 }) == 1;
		assert new RailroadTie().isRailroadTie(new int[] { 1, 2, 0, 1, 2, 0, 1, 2 }) == 1;
		assert new RailroadTie().isRailroadTie(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }) == 0;
		assert new RailroadTie().isRailroadTie(new int[] { 3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3 }) == 1;
		System.out.println("Done");
	}

}

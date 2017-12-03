package p08;

public class GuthrieIndex {

	public GuthrieIndex() {
		// TODO Auto-generated constructor stub
	}

	int guthrieIndex(int n) {
		int count = 0;
		while (n > 1) {
			n = next(n);
			count++;
		}
		return count;
	}

	private int next(int n) {
		if (n % 2 == 0) {
			return n/2;
		} else {
			return n*3 + 1;
		}
	}

	public static void main(String[] args) {
		assert new GuthrieIndex().guthrieIndex(1) == 0;
		assert new GuthrieIndex().guthrieIndex(2) == 1;
		assert new GuthrieIndex().guthrieIndex(3) == 7;
		assert new GuthrieIndex().guthrieIndex(4) == 2;
		assert new GuthrieIndex().guthrieIndex(42) == 8;
		
		System.out.println("done");
	}

}

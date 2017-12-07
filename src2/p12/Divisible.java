package p12;

public class Divisible {

	public Divisible() {
		// TODO Auto-generated constructor stub
	}

	int isDivisible(int[] a, int divisor) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % divisor != 0) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		assert new Divisible().isDivisible(new int[] { 3, 3, 6, 36 }, 3) == 1;
		assert new Divisible().isDivisible(new int[] { 4 }, 2) == 1;
		assert new Divisible().isDivisible(new int[] { 3, 4, 3, 6, 36 }, 3) == 0;
		assert new Divisible().isDivisible(new int[] { 6, 12, 24, 36 }, 2) == 1;
		assert new Divisible().isDivisible(new int[] {}, 2) == 1;
		System.out.println("done");
	}

}

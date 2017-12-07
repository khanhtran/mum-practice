package p11;

public class PerfectNumber {

	public PerfectNumber() {
		// TODO Auto-generated constructor stub
	}

	int henry(int i, int j) {
		int k = 0;
		int n = 1;
		int sum = 0;
		int c = 0;
		while (true) {
			if (isPerfect(n)) {
				k++;
				if (k == i) {
					sum += n;
					c++;
				}
				if (k == j) {
					sum += n;
					c++;
				}
				if (c == 2) {
					return sum;
				}
			}			
			n++;
		}
	}

	private boolean isPerfect(int n) {
		return sumFactor(n) == n;
	}

	private int sumFactor(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		assert new PerfectNumber().henry(1, 3) == 502;
		System.out.println("Done");
	}

}

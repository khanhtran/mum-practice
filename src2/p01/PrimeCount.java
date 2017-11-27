package p01;

public class PrimeCount {

	public PrimeCount() {
		// TODO Auto-generated constructor stub
	}

	public int primeCount(int start, int end) {
		int count = 0;
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}
	
	private boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i*i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(new PrimeCount().primeCount(10, 30));
		System.out.println(new PrimeCount().primeCount(11, 29));
		System.out.println(new PrimeCount().primeCount(20, 22));
		System.out.println(new PrimeCount().primeCount(1, 1));
		System.out.println(new PrimeCount().primeCount(5, 5));
		System.out.println(new PrimeCount().primeCount(6, 2));
		System.out.println(new PrimeCount().primeCount(-10, 6));
	}
}

package p49;

public class PrimeHappy {

	public PrimeHappy() {
		// TODO Auto-generated constructor stub
	}

	int isPrimeHappy(int n) {
		if (n <= 2) {
			return 0;
		}
		int sumPrime = 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				sumPrime += i;
			}
		}
		if ((sumPrime % n) == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	private boolean isPrime(int k) {
		for (int i = 2; i * i <= k; i++) {
			if (k % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		assert new PrimeHappy().isPrimeHappy(5) == 1;
		assert new PrimeHappy().isPrimeHappy(25) == 1;
		assert new PrimeHappy().isPrimeHappy(32) == 1;
		assert new PrimeHappy().isPrimeHappy(8) == 0;
		assert new PrimeHappy().isPrimeHappy(2) == 0;
		System.out.println("Done");
	}

}

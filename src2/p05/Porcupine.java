package p05;

public class Porcupine {

	public Porcupine() {
		// TODO Auto-generated constructor stub
	}

	public int findPorcupineNumber(int n) {
		int k = n + 1;
		while (!isPorcupine(k)) {
			k++;
		}
		return k;
	}

	private boolean isPorcupine(int k) {
		if (!isPrime(k)) {
			return false;
		}

		if (!endWith9(k)) {
			return false;
		}

		int l = nextPrime(k);
		if (!endWith9(l)) {
			return false;
		}
		return true;
	}

	private int nextPrime(int k) {
		int l = k + 1;
		while (!isPrime(l)) {
			l++;
		}
		return l;
	}

	private boolean endWith9(int k) {
		return (k % 10) == 9;
	}

	private boolean isPrime(int k) {
		for (int i = 2; i < k; i++) {
			if (k % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		assert new Porcupine().findPorcupineNumber(0) == 139;
		assert new Porcupine().findPorcupineNumber(138) == 139;
		assert new Porcupine().findPorcupineNumber(139) == 409;
	}

}

package p41;

public class LPF {

	public LPF() {
		// TODO Auto-generated constructor stub
	}
	int largestPrimeFactor(int n) {
		int maxFactor = 0;
		for (int i = 2; i <= n; i++) {
			while (n%i == 0) {
				maxFactor = Math.max(maxFactor, i);
				n = n/i;
			}
		}
		return maxFactor;
	}
	public static void main(String[] args) {
		assert new LPF().largestPrimeFactor(10) == 5;
		assert new LPF().largestPrimeFactor(6936) == 17;
		assert new LPF().largestPrimeFactor(1) == 0;
		System.out.println("Done");

	}

}

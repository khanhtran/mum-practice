package p44;

public class Cube {

	public Cube() {
		// TODO Auto-generated constructor stub
	}

	int isCubePowerful(int n) {
		if (n <= 0) {
			return 0;
		}

		if (sumCubeDigits(n) == n) {
			return 1;
		}
		return 0;
	}

	private int sumCubeDigits(int n) {
		int sum = 0;
		while (n > 0) {
			int d = n % 10;
			sum += d * d * d;
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		assert new Cube().isCubePowerful(153) == 1;
		assert new Cube().isCubePowerful(370) == 1;
		assert new Cube().isCubePowerful(371) == 1;
		assert new Cube().isCubePowerful(407) == 1;
		assert new Cube().isCubePowerful(87) == 0;
		System.out.println("Done");
	}

}

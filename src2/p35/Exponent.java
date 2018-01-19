package p35;

public class Exponent {

	public Exponent() {
		// TODO Auto-generated constructor stub
	}

	int getExponent(int n, int p) {
		if (p <= 1) {
			return -1;
		}
		int x = (int) Math.floor(Math.log(Math.abs(n)) / Math.log(p));
		while (x > 0) {
			if (n % Math.pow(p, x) == 0) {
				break;
			}
			x--;
		}
		return x;
	}

	public static void main(String[] args) {
		assert new Exponent().getExponent(27, 3) == 3;
		assert new Exponent().getExponent(28, 3) == 0;
		assert new Exponent().getExponent(280, 7) == 1;
		assert new Exponent().getExponent(-250, 5) == 3;
		assert new Exponent().getExponent(18, 1) == -1;
		assert new Exponent().getExponent(128, 4) == 3;
		System.out.println("Done");

	}

}

package p08;

public class Solve10 {

	public Solve10() {
		// TODO Auto-generated constructor stub
	}

	int[] solve10() {
		int x, y;
		int[] fac = calFac();
		for (x = 0; x <= 10; x++) {
			for (y = 0; y <= 10; y++) {
				if (fac[x] + fac[y] == fac[10]) {
					return new int[] { x, y };
				}
			}
		}

		return new int[] { 0, 0 };
	}

	private int[] calFac() {
		int fac[] = new int[11];
		fac[0] = fac[1] = 1;
		for (int i = 2; i < fac.length; i++) {
			fac[i] = i * fac[i - 1];
		}
		return fac;
	}

	public static void main(String[] args) {
		int[] a = new Solve10().solve10();
		System.out.println("x=" + a[0] + ", y=" + a[1]);
	}

}

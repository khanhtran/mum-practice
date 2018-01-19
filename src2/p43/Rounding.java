package p43;

public class Rounding {

	public Rounding() {
		// TODO Auto-generated constructor stub
	}

	static void doIntegerBasedRounding(int[] a, int n) {
		for (int i = 0; i < a.length; i++) {
			a[i] = round(a[i], n);
		}
	}

	static private int round(int k, int n) {
		if (k < 0) {
			return k;
		}
		double d = (double)k*1.0/n;
		int lower = (int) Math.floor(d);
		int upper = (int)Math.ceil(d);

		int delta1 = Math.abs(lower * n - k);
		int delta2 = Math.abs(upper * n - k);

		if (delta1 < delta2) {
			return lower * n;
		} else {
			return upper * n;
		}
	}

	static void printArr(int[] a) {
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		doIntegerBasedRounding(a, 2);
		printArr(a);		
//		System.out.println(round(6, 4));
	}

}

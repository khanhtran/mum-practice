package p09;

public class RespEqual {

	public RespEqual() {
		// TODO Auto-generated constructor stub
	}

	public int respEqual(int[] a, int n) {
		int m = toNum(a);
		if (m == n) {
			return 1;
		} else {
			return 0;
		}
	}

	private int toNum(int[] a) {
		int num = 0;
		int d = 1;
		for (int i = a.length - 1; i >= 0; i--) {
			num += d * a[i];
			d = 10 * d;
		}
		return num;
	}

	public static void main(String[] args) {
		assert new RespEqual().respEqual(new int[] { 3, 2, 0, 5, 3 }, 32053) == 1;
		assert new RespEqual().respEqual(new int[] { 3, 2, 0, 5 }, 32053) == 0;
		assert new RespEqual().respEqual(new int[] { 3, 2, 0, 5, 3, 4 }, 32053) == 0;
		assert new RespEqual().respEqual(new int[] { 2, 3, 0, 5, 3 }, 32053) == 0;
		assert new RespEqual().respEqual(new int[] { 9, 3, 1, 1, 2 }, 32053) == 0;
		assert new RespEqual().respEqual(new int[] { 0, 3, 2, 0, 5, 3 }, 32053) == 1;
		System.out.println("done");
	}

}

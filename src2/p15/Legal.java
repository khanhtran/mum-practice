package p15;

public class Legal {

	public Legal() {
		// TODO Auto-generated constructor stub
	}

	int isLegalNumber(int[] a, int base) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= base) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		assert new Legal().isLegalNumber(new int[] { 3, 2, 1 }, 4) == 1;
		assert new Legal().isLegalNumber(new int[] { 3, 5, 1 }, 4) == 0;
		System.out.println("Done");
	}

}

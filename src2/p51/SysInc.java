package p51;

public class SysInc {

	public SysInc() {
		// TODO Auto-generated constructor stub
	}
	int isSystematicallyIncreasing(int[] a) {
		int n = 1;
		int i = 0;
		while (i < a.length) {
			boolean bIncrease = isIncrease(a, n, i);
			if (!bIncrease) {
				return 0;
			}			
			i+= n;
			n++;
		}
		if (i == a.length) {
			return 1;
		} else {
			return 0;
		}
	}
	private boolean isIncrease(int[] a, int n, int i) {
		for (int j = i; j < i + n; j++) {
			if (a[j] != j - i + 1) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		assert new SysInc().isSystematicallyIncreasing(new int[] {1}) == 1;
		assert new SysInc().isSystematicallyIncreasing(new int[] {1,1,2,1,2,3}) == 1;
		assert new SysInc().isSystematicallyIncreasing(new int[] {1,2,1,2,3}) == 0;
		System.out.println("Done");
	}

}

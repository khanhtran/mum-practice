package p52;

public class SecondLargest {

	public SecondLargest() {
		// TODO Auto-generated constructor stub
	}
	
	int secondLargest(int a[]) {
		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max1) {
				max2 = max1;
				max1 = a[i];
			} else {
				if (a[i] > max2) {
					max2 = a[i];
				}
			}
		}
		return max2;
	}
	public static void main(String[] args) {
		assert new SecondLargest().secondLargest(new int[] {1, 6, 6, 6, 4, 5, 8, 1}) == 6;

	}

}

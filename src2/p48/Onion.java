package p48;

public class Onion {

	public Onion() {
		// TODO Auto-generated constructor stub
	}
	
	static int isOnionArray(int[] a) {
		int i = 0, j = a.length - 1;
		while (i < j) {
			if (a[i] + a[j] > 10) {
				return 0;
			}
			i++;
			j--;
		}
		return 1;
	}

	public static void main(String[] args) {
		assert isOnionArray(new int[] {1, 2, 19, 4, 5}) == 1;
		assert isOnionArray(new int[] {1, 2, 19, 4, 15}) == 0;
		assert isOnionArray(new int[] {1, 3, 9, 8}) == 0;
		assert isOnionArray(new int[] {2}) == 1;
		assert isOnionArray(new int[] {}) == 1;
		assert isOnionArray(new int[] {-2, 5, 0, 5, 12}) == 1;
		System.out.println("Done");
	}

}

package p18;

public class Stacked {

	public Stacked() {
		// TODO Auto-generated constructor stub
	}

	int isStacked(int n) {
		int sum = 0;
		int i = 1;
		while (sum < n) {
			sum += i;
			i++;
		}
		if (sum == n) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		assert new Stacked().isStacked(1) == 1;
		assert new Stacked().isStacked(3) == 1;
		assert new Stacked().isStacked(6) == 1;
		assert new Stacked().isStacked(10) == 1;
		assert new Stacked().isStacked(15) == 1;
		assert new Stacked().isStacked(8) == 0;
		assert new Stacked().isStacked(9) == 0;
		System.out.println("Done");
	}

}

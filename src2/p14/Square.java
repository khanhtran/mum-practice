package p14;

public class Square {

	public Square() {
	}

	int isSquare(int n) {
		int i = 0;
		while (i * i < n) {
			i++;
		}

		if (i * i == n) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		assert new Square().isSquare(4) == 1;
		assert new Square().isSquare(25) == 1;
		assert new Square().isSquare(-4) == 0;
		assert new Square().isSquare(8) == 0;
		assert new Square().isSquare(0) == 1;
		System.out.println("Done");
	}

}

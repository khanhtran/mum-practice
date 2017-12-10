package p20;

import java.util.ArrayList;
import java.util.List;

public class Isolated {
	static final long MAX = 2097151;

	public Isolated() {
		// TODO Auto-generated constructor stub
	}

	int isIsolated(long n) {
		if (n > MAX) {
			return -1;
		}
		long square = n * n;
		long cube = square * n;
		List<Integer> squareArray = toList(square);
		List<Integer> cubeArray = toList(cube);
		if (isCommon(squareArray, cubeArray)) {
			return 0;
		}
		return 1;
	}

	private boolean isCommon(List<Integer> squareArray, List<Integer> cubeArray) {
		for (int i = 0; i < squareArray.size(); i++) {
			if (cubeArray.contains(squareArray.get(i))) {
				return true;
			}
		}
		for (int i = 0; i < cubeArray.size(); i++) {
			if (squareArray.contains(cubeArray.get(i))) {
				return true;
			}
		}
		return false;
	}

	private List<Integer> toList(long n) {
		List<Integer> result = new ArrayList<>();
		while (n > 0) {
			result.add((int) n % 10);
			n = n / 10;
		}
		return result;
	}

	public static void main(String[] args) {
		assert new Isolated().isIsolated(69) == 1;
		assert new Isolated().isIsolated(162) == 0;
		System.out.println("Done");
	}

}

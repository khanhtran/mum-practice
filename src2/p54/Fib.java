package p54;

import java.util.ArrayList;
import java.util.List;

public class Fib {

	public Fib() {
		// TODO Auto-generated constructor stub
	}

	List<Integer> fibs = new ArrayList<>();

	int closestFibonacci(int n) {
		if (n < 1) {
			return 0;
		}
		makeFibs(n);
		int i = fibs.size() - 1;
		int k = fibs.get(i);
		while (k >= n) {
			i--;
			k = fibs.get(i);
		}
		return k;
	}

	private void makeFibs(int n) {
		fibs.add(1);
		fibs.add(1);
		for (int i = 2; i < n; i++) {
			fibs.add(fibs.get(i - 2) + fibs.get(i - 1));
		}
	}

	public static void main(String[] args) {
		assert new Fib().closestFibonacci(13) == 8;
		assert new Fib().closestFibonacci(33) == 21;
		System.out.println("Done");
	}

}

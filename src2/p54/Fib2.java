package p54;

import java.util.ArrayList;
import java.util.List;

public class Fib2 {

	public Fib2() {
		// TODO Auto-generated constructor stub
	}

	int closestFibonacci(int n) {
		if (n < 1) {
			return 0;
		}
		int n2 = 1, n1 = 1;
		int c = n2 + n1;		
		while (c < n) {
			n2 = n1;
			n1 = c;
			c = n2 + n1;
		}		
		return n1;
	}

	public static void main(String[] args) {
		assert new Fib2().closestFibonacci(13) == 8;
		assert new Fib2().closestFibonacci(33) == 21;
		System.out.println("Done");
	}

}

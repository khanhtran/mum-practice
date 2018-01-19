package p54;

import java.util.ArrayList;
import java.util.List;

public class Fib3 {

	public Fib3() {
		// TODO Auto-generated constructor stub
	}

	int isFibonacci(int n) {
		if (n == 1|| n == 2) {
			return 1;
		}
		
		int p2 = 1;
		int p1 = 1;
		int p = p2 + p2;
		while (p < n) {
			p1 = p2;
			p2 = p;
			p = p1 + p2;
		}
		if (p == n) {
			return 1;
		} else {
			return 0;
		}		
	}

	public static void main(String[] args) {
		assert new Fib3().isFibonacci(13) == 1;
		assert new Fib3().isFibonacci(34) == 1;
		assert new Fib3().isFibonacci(100) == 0;
		System.out.println("Done");
	}

}

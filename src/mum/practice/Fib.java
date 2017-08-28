package mum.practice;

public class Fib {

	public Fib() {
		// TODO Auto-generated constructor stub
	}

	public static int fib1(int n) {
		System.out.println("Fib1(" + n + ")");
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fib1(n - 2) + fib1(n - 1);
		}
	}

	public static void main(String[] args) {
		fib1(5);

	}

}

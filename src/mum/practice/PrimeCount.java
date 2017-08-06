package mum.practice;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class PrimeCount extends Solution {
	
	public PrimeCount() {
		input = "20 22";
	}

	@Override
	public Object solve() {
		Scanner sc =  new Scanner(new ByteArrayInputStream(((String)input).getBytes()));
		int start = sc.nextInt();
		int end = sc.nextInt();
		output = primeCount(start, end) + "";
		return output;
	}
	
	public boolean checkPrime(int n) {
		if (n <= 1) {
			return false;
		}
		if (n == 2 || n == 3) {
			return true;
		}
		for (int i = 2; i*i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public int primeCount(int start, int end) {
		int count = 0;
		for (int i = start; i <= end; i++) {
			if (checkPrime(i)) {
				System.out.println(i);
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Solution s = new PrimeCount();
		s.solve();
		s.printResult();
	}

}

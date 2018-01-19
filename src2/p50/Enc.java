package p50;

import java.util.ArrayList;
import java.util.List;

public class Enc {

	public Enc() {
		// TODO Auto-generated constructor stub
	}

	int[] encodeArray(int n) {
		List<Integer> encoded = new ArrayList<>();
		if (n < 1) {
			encoded.add(-1);
			n = -1*n;
		}
		
		List<Integer> digits = toDigits(n);
		for (int d : digits) {
			List<Integer> encodedDigits = toZeros(d);
			encoded.addAll(encodedDigits);
		}
		
		int[] result = new int[encoded.size()];
		
		for (int i = 0; i < encoded.size(); i++) {
			result[i] = encoded.get(i);
		}
		return result;
	}

	private List<Integer> toZeros(int d) {
		List <Integer> lst = new ArrayList<>();
		for (int i = 0; i < d; i++) {
			lst.add(0);
		}
		lst.add(1);
		return lst;
	}

	private List<Integer> toDigits(int n) {
		List<Integer> digits = new ArrayList<>();
		while (n > 0) {
			int d = n%10;
			n = n/10;
			digits.add(0, d);
		}
		return digits;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package p41;

import java.util.ArrayList;
import java.util.List;

public class Fac {

	public Fac() {
		// TODO Auto-generated constructor stub
	}

	int[] encodeNumber(int n) {
		if (n <= 1) {
			return null;
		}
		
		List<Integer> fac = new ArrayList<>();
		for (int i = 2; i <= n; i++) {
			while (n %i == 0) {
				fac.add(i);
				n = n/i;
			}
		}
		int[] result = new int[fac.size()];
		for (int i = 0; i < fac.size(); i++) {
			result[i] = fac.get(i);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = new Fac().encodeNumber(6936);
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}

package p37;

import java.util.ArrayList;
import java.util.List;

public class Filter {

	public Filter() {
		// TODO Auto-generated constructor stub
	}

	int[] filterArray(int[] a, int n) {
		int[] indices = calculateIndices(n);
		int[] result = new int[indices.length];
		for (int i = 0; i < indices.length; i++) {
			int index = indices[i];
			if (index < a.length) {
				result[i] = a[index];
			} else {
				return null;
			}
		}
		return result;
	}

	private int[] calculateIndices(int n) {
		List<Integer> digits = new ArrayList<>();
		while (n > 0) {
			int d = n % 2;
			digits.add(d);
			n = n / 2;
		}

		List<Integer> indices = new ArrayList<>();
		for (int i = 0; i < digits.size(); i++) {
			int d = digits.get(i);
			if (d == 1) {
				indices.add(i);
			}
		}

		int[] iArray = new int[indices.size()];
		for (int i = 0; i < indices.size(); i++) {
			iArray[i] = indices.get(i);
		}
		return iArray;
	}

	public static void main(String[] args) {
		int[] a = new Filter().filterArray(new int[] { 9, -9 }, 0);
		printArr(a);
		a = new Filter().filterArray(new int[] { 8, 4, 9, 0, 3, 1, 2 }, 88);
		printArr(a);
	}

	private static void printArr(int[] a) {

		for (int i = 0; i < a.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(a[i]);

		}
		System.out.println();
	}

}

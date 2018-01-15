package p31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {

	public Permutation() {
		// TODO Auto-generated constructor stub
	}

	public static List<List<Integer>> permutation(List<Integer> arr) {
//		System.out.println("permu " + toStr(arr));
		if (arr.size() == 1) {
			List<Integer> row = new ArrayList<>();
			row.add(arr.get(0));

			List<List<Integer>> result = new ArrayList<>();
			result.add(row);
			return result;
		}
		List<List<Integer>> result = new ArrayList<>();
		int firstItem = arr.remove(0);
		List<List<Integer>> rightPermu = permutation(arr);

		
		for (List<Integer> lst : rightPermu) {
			for (int i = 0; i <= arr.size(); i++) {
				List<Integer> temp = new ArrayList<>(lst);
				temp.add(i, firstItem);
				result.add(temp);
			}
		}
		
		
//		System.out.println(matrixToStr(result));
//		System.out.println("---------------------");
		return result;
	}

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		List<List<Integer>> permutations = permutation(arr);
		System.out.println(matrixToStr(permutations));
	}

	public static String toStr(List row) {
		String str = "";
		for (int j = 0; j < row.size(); j++) {
			str += row.get(j) + " ";
		}
		return str;
	}

	public static String matrixToStr(List<List<Integer>> matrix) {
		String result = "";
		for (int i = 0; i < matrix.size(); i++) {
			List row = matrix.get(i);
			result += toStr(row);
			result += "\n";
		}
		return result;
	}
}

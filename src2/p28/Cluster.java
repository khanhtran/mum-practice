package p28;

import java.util.ArrayList;
import java.util.List;

public class Cluster {

	public Cluster() {
		// TODO Auto-generated constructor stub
	}

	int[] clusterCompression(int[] a) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (list.isEmpty()) {
				list.add(a[i]);
			} else {
				int lastElem = list.get(list.size() - 1);
				if (a[i] != lastElem) {
					list.add(a[i]);
				}
			}
		}

		int[] result = new int[list.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
		}
		return result;
	}

	public static void main(String[] args) {
		assert arrTostr(new Cluster().clusterCompression(new int[] { 0, 0, 0, 2, 0, 2, 0, 2, 0, 0 })).equals("0202020");
		System.out.println("Done");
	}

	private static Object arrTostr(int[] a) {
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < a.length; i++) {
			str.append(a[i]);
		}
		return str.toString();
	}

}

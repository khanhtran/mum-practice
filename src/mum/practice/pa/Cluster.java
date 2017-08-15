package mum.practice.pa;

import java.util.ArrayList;
import java.util.List;

import mum.practice.Solution;

/**
 * 2. Define a cluster in an integer array to be a maximum sequence of elements
 * that are all the same value. For example, in the array {3, 3, 3, 4, 4, 3, 2,
 * 2, 2, 2, 4} there are 5 clusters, {3, 3, 3}, {4, 4}, {3}, {2, 2, 2, 2} and
 * {4}. A cluster-compression of an array replaces each cluster with the number
 * that is repeated in the cluster. So, the cluster compression of the previous
 * array would be {3, 4, 3, 2, 4}. The first cluster {3, 3, 3} is replaced by a
 * single 3, and so on.Write a function named clusterCompression with the
 * following signature
 * 
 * @author Khanh
 *
 */
public class Cluster extends Solution {

	public Cluster() {
		input = "11 3 3 3 4 4 3 2 2 2 2 4";
	}

	@Override
	public Object solve() {
		super.solve();
		int[] a = readArray();
		output = custerCompress(a);
		printResult();
		return null;
	}

	private int[] custerCompress(int[] a) {
		List<Integer> lst = new ArrayList<>();
		int prev = -1;
		for (int i = 0; i < a.length; i++) {
			if (i == 0 || a[i] != prev) {
				lst.add(a[i]);
			}
			prev = a[i];
		}
		int[] res = new int[lst.size()];
		for (int k = 0; k < lst.size(); k++) {
			res[k] = lst.get(k);
		}
		return res;
	}

	public static void main(String[] args) {
		new Cluster().solve();
	}

}

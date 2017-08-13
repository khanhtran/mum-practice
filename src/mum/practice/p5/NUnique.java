package mum.practice.p5;

import mum.practice.Solution;

public class NUnique extends Solution {

	public NUnique() {
		input = "4 2 7 3 4";		
	}
	
    @Override
    public Object solve() {
    	super.solve();
    	int[] a = readArray();
    	output = isNUnique(a, 5);
    	printResult();
    	return null;
    }
    
    /**
     * N unique using brute force
     * @param a
     * @param n
     * @return
     */
	private Object isNUnique(int[] a, int n) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (n == (a[i] + a[j])) {
					count++;
				}
			}
		}
		if (count == 1) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		new NUnique().solve();
	}

}

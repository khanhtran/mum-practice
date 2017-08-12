package mum.practice.p4;

import mum.practice.Solution;

/**
 * Solve x! + y! = 10! 
 * Method: Brute Force
 * @author Khanh
 *
 */
public class Solve10 extends Solution {

	public Solve10() {			
	}
	
	public Object solve() {
		int[] fac = calculateFac(10);
		int[] xy = calculate10(fac);
//		printResult();
		System.out.println(xy[0] + " " + xy[1]);
		return null;
	}
	private int[] calculate10(int[] fac) {
		boolean find = false;
		int[]xy = new int[2];
		for (int i = 0; i <= 10 && !find; i++) {
			for (int j = 0; j <= 10; j++) {
				if (fac[10] == fac[i] + fac[j]) {
//					find = true;
					xy[0] = i;
					xy[1] = j;
//					break;
					System.out.println(i + " " + j);
				}
			}
		}
		if (!find) {
			xy[0] = 0;
			xy[1] = 0;
		}
		return xy;
	}

	private int[] calculateFac(int n) {
		int[] fac = new int[n+1];
		fac[1] = 1;
		fac[2] = 2;
		for (int i = 3; i <= n; i++) {
			fac[i] = i*fac[i-1];
		}
		return fac;
	}

	public static void main(String[] args) {
		new Solve10().solve();
	}

}

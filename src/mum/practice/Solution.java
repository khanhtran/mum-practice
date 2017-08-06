package mum.practice;

public abstract class Solution {
	protected Object input;
	protected Object output;	
	public abstract Object solve();
	public void printResult() {
		System.out.println(output);
	}
}

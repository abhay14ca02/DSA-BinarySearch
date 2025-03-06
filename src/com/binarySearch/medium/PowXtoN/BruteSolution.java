package com.binarySearch.medium.PowXtoN;

public class BruteSolution {
	private static double myPow(double x, int n) {

		double ans = 1.0;
		for (int i = 0; i < Math.abs(n); i++) {
			ans = ans * x;
		}
		if (n < 0) {
			return 1 / ans;
		}
		return ans;
	}

	public static void main(String[] args) {
		double x = 2.00000;
		int n = 10;
		double ans = myPow(x, n);
		System.out.println(ans);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)
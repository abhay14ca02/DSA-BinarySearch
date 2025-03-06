package com.binarySearch.medium.PowXtoN;

public class OptimalSolution {
	private static double myPow(double x, int n) {
		double ans = 1.0;
		long num = n;
		if (num < 0) {
			num = -1 * num;
		}
		while (num > 0) {
			if (num % 2 == 1) {// if num is odd
				ans = ans * x;
				num = num - 1;
			} else {// if num is even
				x = x * x;
				num = num / 2;
			}
		}
		if (n < 0) {
			ans = (double) (1.0) / (double) (ans);
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
//Time Complexity: O(log n)
//Space Complexity: O(1)
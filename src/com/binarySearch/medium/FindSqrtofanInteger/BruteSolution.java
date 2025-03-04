package com.binarySearch.medium.FindSqrtofanInteger;

public class BruteSolution {
	private static int mySqrt(int n) {
		if (n == 0)
			return 0;
		int ans = 1;
		for (long i = 0; i <= n; i++) {
			long val = i * i;
			if (val <= (long) n) {
				ans = (int) i;
			} else {
				break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {

		int n = 2147395600;
		int ans = mySqrt(n);
		System.out.println(ans);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)
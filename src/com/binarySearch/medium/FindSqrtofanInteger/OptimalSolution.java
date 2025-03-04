package com.binarySearch.medium.FindSqrtofanInteger;

public class OptimalSolution {
	private static int mySqrt(int n) {
		if (n == 0) {
			return 0;
		}
		int low = 1;
		int high = n;
		int ans = 1;
		// Binary search on the answers
		while (low <= high) {
			long mid = (low + high) / 2;
			long val = mid * mid;
			if (val <= (long) n) {
				ans = (int) mid;
				// eliminate the left half
				low = (int) (mid + 1);
			} else {
				// eliminate the right half
				high = (int) (mid - 1);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int n = 28;
		int ans = mySqrt(n);
		System.out.println(ans);
	}

}
//Time Complexity : O(LogN)
//Space Complexity : O(1)
package com.binarySearch.medium.FindtheNthRootofanInteger;

public class OptimalSolution {
	private static int findRoot(int n, int m) {

		int low = 1;
		int high = m;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int val = root(mid, n, m);
			if (val == 1) {
				return mid;
			} else if (val == 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	private static int root(int mid, int n, int m) {

		// Return 1 if mid == m
		// Return 0 if mid < m
		// Return 2 if mid > m
		long ans = 1;
		for (int i = 1; i <= n; i++) {
			ans = ans * mid;
		}
		if (ans > m) {
			return 2;
		} else if (ans == m) {
			return 1;
		} else if (ans < m) {
			return 0;
		}

		return -1;
	}

	public static void main(String[] args) {
		int n = 3;
		int m = 27;
		int ans = findRoot(n, m);
		System.out.println(ans);
	}
}
//Time Complexity : O(LogM) * O(N)
//Space Complexity : O(1)
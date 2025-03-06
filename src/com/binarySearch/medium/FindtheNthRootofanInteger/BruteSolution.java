package com.binarySearch.medium.FindtheNthRootofanInteger;

public class BruteSolution {
	private static int findRoot(int n, int m) {

		for (int i = 1; i <= m; i++) {
			int val = root(i, n);
			if (val == m) {
				return i;
			} else if (val > m) {
				break;
			}
		}
		return -1;
	}

	private static int root(int i, int n) {
		int ans = 1;
		while (n > 0) {
			ans = ans * i;
			n--;
		}
		return ans;
	}

	public static void main(String[] args) {

		int n = 3;
		int m = 27;
		int ans = findRoot(n, m);
		System.out.println(ans);
	}
}
//Time Complexity : O(m)*O(n)
//Space Complexity : O(1)
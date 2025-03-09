package com.binarySearch.hard.AggressiveCows;

import java.util.Arrays;

public class OptimalSolution {
	private static int aggressiveCows(int[] stalls, int cows) {

		Arrays.sort(stalls);
		int n = stalls.length;
		int low = 1;
		int high = stalls[n - 1] - stalls[0];
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (canWePlace(stalls, mid, cows) == true) {
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

	private static boolean canWePlace(int[] stalls, int dist, int cows) {
		int n = stalls.length;
		int countCows = 1; // no. of cows placed
		int last = stalls[0];// position of last placed cow
		for (int i = 1; i < n; i++) {
			if (stalls[i] - last >= dist) {
				countCows++;// place next cow.
				last = stalls[i];// update the last location
			}
			if (countCows >= cows)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] stalls = { 0, 3, 4, 7, 10, 9 };
		int cows = 4;
		int ans = aggressiveCows(stalls, cows);
		System.out.println(ans);
	}
}
//Time Complexity: O(NlogN) + O(N * log(max(stalls[])-min(stalls[]))
//Space Complexity: O(1)

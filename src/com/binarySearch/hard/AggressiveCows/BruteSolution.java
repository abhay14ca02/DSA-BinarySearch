package com.binarySearch.hard.AggressiveCows;

import java.util.Arrays;

public class BruteSolution {
	private static int aggressiveCows(int[] stalls, int cows) {
		Arrays.sort(stalls);
		int n = stalls.length;
		int min = stalls[0];
		int max = stalls[n - 1];
		int limit = max - min;
		for (int dist = 1; dist <= limit; dist++) {
			if (canWePlace(stalls, dist, cows) == false) {
				return (dist - 1);
			}
		}
		return limit;
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
//Time Complexity: O(NlogN) + O(N *(max(stalls[])-min(stalls[]))
//Space Complexity: O(1)

package com.binarySearch.medium.KokoEatingBananas;

public class OptimalSolution {
	private static int minEatingSpeed(int[] piles, int hr) {
		int low = 1;
		int high = findMax(piles);
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int totalHour = calculateTotalHours(piles, mid);
			if (totalHour <= hr) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	private static int calculateTotalHours(int[] piles, int mid) {
		int totalH = 0;
		int n = piles.length;
		// find total hours
		for (int i = 0; i < n; i++) {
			totalH += Math.ceil((double) (piles[i]) / (double) (mid));
		}
		return totalH;
	}

	private static int findMax(int[] piles) {
		int maxi = Integer.MIN_VALUE;
		int n = piles.length;
		for (int i = 0; i < n; i++) {
			maxi = Math.max(maxi, piles[i]);
		}
		return maxi;
	}

	public static void main(String[] args) {
		int[] piles = { 3, 6, 7, 11 };
		int hr = 8;
		int minSpeed = minEatingSpeed(piles, hr);
		System.out.println(minSpeed);
	}
}
//Time Complexity : O(n) * log(max(piles))
//Space Complexity : O(1)
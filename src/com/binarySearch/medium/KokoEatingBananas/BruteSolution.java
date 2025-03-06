package com.binarySearch.medium.KokoEatingBananas;

public class BruteSolution {
	private static int minEatingSpeed(int[] piles, int h) {
		int maxi = findMaximum(piles);
		for (int i = 1; i <= maxi; i++) {
			int totalTime = calculateTotalHours(piles, i);
			if (totalTime <= h) {
				return i;
			}
		}
		// dummy return statement
		return -1;
	}

	private static int calculateTotalHours(int[] piles, int hourly) {
		int totalH = 0;
		int n = piles.length;
		// find total hours
		for (int j = 0; j < n; j++) {
			totalH += Math.ceil((double) (piles[j]) / (double) (hourly));
		}
		return totalH;
	}

	private static int findMaximum(int[] piles) {
		int maxi = Integer.MIN_VALUE;
		int n = piles.length;
		for (int i = 0; i < n; i++) {
			maxi = Math.max(maxi, piles[i]);
		}
		return maxi;
	}

	public static void main(String[] args) {
		int[] piles = { 3, 6, 7, 11 };
		int h = 8;
		int minSpeed = minEatingSpeed(piles, h);
		System.out.println(minSpeed);
	}
}
//Time Complexity : O(max(piles)) * O(n)
//Space Complexity : O(1)
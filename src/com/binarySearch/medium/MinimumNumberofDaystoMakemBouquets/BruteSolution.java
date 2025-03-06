package com.binarySearch.medium.MinimumNumberofDaystoMakemBouquets;

public class BruteSolution {
	private static int minDays(int[] bloomDay, int m, int k) {
		long val = (long) m * k;
		int n = bloomDay.length;
		if (val > n) {
			return -1;
		}
		int minDays = Integer.MAX_VALUE;
		int maxDays = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			minDays = Math.min(minDays, bloomDay[i]);
			maxDays = Math.max(maxDays, bloomDay[i]);
		}
		for (int day = minDays; minDays <= maxDays; day++) {
			if (possibleToMake(bloomDay, day, m, k)) {
				return day;
			}
		}
		return -1;
	}

	private static boolean possibleToMake(int[] bloomDay, int day, int m, int k) {
		int n = bloomDay.length;
		int count = 0;
		int noOfB = 0;
		// Count the number of bouquets
		for (int i = 0; i < n; i++) {

			if (bloomDay[i] <= day) {
				count++;
			} else {
				noOfB += (count / k);
				count = 0;
			}
		}
		noOfB += (count / k);
		return noOfB >= m;
	}

	public static void main(String[] args) {
		int[] bloomDay = { 1, 10, 3, 10, 2 };
		int m = 3;
		int k = 1;
		int minimumDays = minDays(bloomDay, m, k);
		System.out.println(minimumDays);
	}
}
//Time Complexity : O(max(bloomDay) - min(bloomDay) + 1) * O(n)
//Space complexity : O(1)

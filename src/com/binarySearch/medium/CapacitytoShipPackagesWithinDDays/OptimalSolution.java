package com.binarySearch.medium.CapacitytoShipPackagesWithinDDays;

public class OptimalSolution {
	private static int shipWithinDays(int[] weights, int days) {

		// Find the maximum and the summation
		int maxi = Integer.MIN_VALUE, sum = 0;
		for (int i = 0; i < weights.length; i++) {
			sum += weights[i];
			maxi = Math.max(maxi, weights[i]);
		}
		int low = maxi;
		int high = sum;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (findDays(weights, mid) <= days) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static int findDays(int[] weights, int cap) {
		int days = 1; // First day.
		int load = 0;
		int n = weights.length; // size of array.
		for (int i = 0; i < n; i++) {
			if (load + weights[i] > cap) {
				days += 1; // move to next day
				load = weights[i]; // load the weight.
			} else {
				// load the weight on the same day.
				load += weights[i];
			}
		}
		return days;
	}

	public static void main(String[] args) {
		int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int days = 5;
		int ans = shipWithinDays(weights, days);
		System.out.println(ans);
	}
}
//Time Complexity : O(log(Sum - max) +1) * O(n)
//Space Complexity : O(1)
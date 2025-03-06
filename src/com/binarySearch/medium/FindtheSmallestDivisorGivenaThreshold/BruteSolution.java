package com.binarySearch.medium.FindtheSmallestDivisorGivenaThreshold;

public class BruteSolution {
	private static int smallestDivisor(int[] nums, int threshold) {
		int n = nums.length;
		// Find the maximum element
		int maxi = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			maxi = Math.max(maxi, nums[i]);
		}
		for (int d = 1; d <= maxi; d++) {
			// Find the summation result
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += Math.ceil((double) (nums[i]) / (double) (d));
			}
			if (sum <= threshold) {
				return d;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 44, 22, 33, 11, 1 };
		int threshold = 5;
		int ans = smallestDivisor(nums, threshold);
		System.out.println(ans);

	}
}
//Time Complexity : O(max(nums) * n)
//Space Complexity : O(1)
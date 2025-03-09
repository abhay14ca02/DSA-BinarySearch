package com.binarySearch.hard.SplitArrayLargestSum;

public class BruteSolution {
	private static int splitArray(int[] nums, int k) {

		int n = nums.length;
		int max = Integer.MIN_VALUE;
		int cumSum = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, nums[i]);
			cumSum += nums[i];
		}
		for (int maxSum = max; maxSum <= cumSum; maxSum++) {
			if (canSplit(nums, maxSum) == k) {
				return maxSum;
			}

		}
		return max;
	}

	private static int canSplit(int[] nums, int maxSum) {
		int n = nums.length; // size of array.
		int split = 1;
		long subarraySum = 0;
		for (int i = 0; i < n; i++) {
			if (subarraySum + nums[i] <= maxSum) {
				// insert element to current subarray
				subarraySum += nums[i];
			} else {
				// insert element to next subarray
				split++;
				subarraySum = nums[i];
			}
		}
		return split;
	}

	public static void main(String[] args) {
		int[] nums = { 7, 2, 5, 10, 8 };
		int k = 2;
		int ans = splitArray(nums, k);
		System.out.println(ans);
	}
}

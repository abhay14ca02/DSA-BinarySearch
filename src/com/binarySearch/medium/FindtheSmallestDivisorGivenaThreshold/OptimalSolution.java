package com.binarySearch.medium.FindtheSmallestDivisorGivenaThreshold;

public class OptimalSolution {
	private static int smallestDivisor(int[] nums, int threshold) {
		int n = nums.length;
		if (n > threshold)
			return -1;
		// Find the maximum element
		int maxi = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			maxi = Math.max(maxi, nums[i]);
		}
		int low = 1;
		int high = maxi;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (sumByDivisor(nums, mid) <= threshold) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	private static int sumByDivisor(int[] nums, int mid) {
		int sum = 0;
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			sum += Math.ceil((double) (nums[i]) / (double) (mid));
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] nums = { 44, 22, 33, 11, 1 };
		int threshold = 5;
		int ans = smallestDivisor(nums, threshold);
		System.out.println(ans);
	}
}
//Time Complexity : O(Log(max(nums) * n)
//Space Complexity : O(1)

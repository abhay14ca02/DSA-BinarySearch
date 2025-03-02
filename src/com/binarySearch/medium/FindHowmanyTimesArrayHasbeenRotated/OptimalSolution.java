package com.binarySearch.medium.FindHowmanyTimesArrayHasbeenRotated;

public class OptimalSolution {
	private static int countRotation(int[] nums) {
		int n = nums.length;
		int min = Integer.MAX_VALUE;
		int idx = -1;
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[low] <= nums[mid]) {
				if (nums[low] < min) {
					min = nums[low];
					idx = low;
				}
				low = mid + 1;
			} else {
				if (nums[mid] < min) {
					min = nums[mid];
					idx = mid;
				}
				high = mid - 1;
			}
		}
		return idx;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 4, 5, 1, 2 };
		int ans = countRotation(nums);
		System.out.println(ans);

	}
}
//Time Complexity : O(LogN)
//Space Complexity : O(1)

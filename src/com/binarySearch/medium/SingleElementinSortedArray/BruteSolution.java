package com.binarySearch.medium.SingleElementinSortedArray;

public class BruteSolution {
	private static int singleNonDuplicate(int[] nums) {
		int n = nums.length;
		if (n == 1)
			return nums[0];
		for (int i = 0; i < n; i++) {
			// Check for first index
			if (i == 0) {
				if (nums[i] != nums[i + 1]) {
					return nums[i];
				}
			}
			// Check for last index
			else if (i == n - 1) {
				if (nums[i] != nums[i - 1]) {
					return nums[i];
				}
			} else {
				if (nums[i] != nums[i + 1] && nums[i] != nums[i - 1]) {
					return nums[i];
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
		int ans = singleNonDuplicate(nums);
		System.out.println(ans);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)
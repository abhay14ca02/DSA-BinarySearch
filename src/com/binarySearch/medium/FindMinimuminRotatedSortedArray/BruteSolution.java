package com.binarySearch.medium.FindMinimuminRotatedSortedArray;

public class BruteSolution {
	private static int findMin(int[] nums) {
		int n = nums.length;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 4, 5, 1, 2 };
		int ans = findMin(nums);
		System.out.println(ans);

	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)
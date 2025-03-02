package com.binarySearch.medium.SearchElementinRotatedSortedArrayII;

public class BruteSolution {

	private static boolean searchRotatedSorted(int[] nums, int target) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (nums[i] == target) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 5, 6, 0, 0, 1, 2 };
		int target = 0;
		boolean ans = searchRotatedSorted(nums, target);
		System.out.println(ans);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)
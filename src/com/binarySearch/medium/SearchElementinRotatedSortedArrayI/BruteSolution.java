package com.binarySearch.medium.SearchElementinRotatedSortedArrayI;

public class BruteSolution {

	private static int searchRotatedSorted(int[] nums, int target) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (nums[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 1;
		int ans = searchRotatedSorted(nums, target);
		System.out.println(ans);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)
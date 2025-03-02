package com.binarySearch.medium.SingleElementinSortedArray;

public class BetterSolution {
	private static int singleNonDuplicate(int[] nums) {
		int n = nums.length;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans = ans ^ nums[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
		int ans = singleNonDuplicate(nums);
		System.out.println(ans);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)
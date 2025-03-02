package com.binarySearch.medium.FindHowmanyTimesArrayHasbeenRotated;

public class BruteSolution {
	private static int countRotation(int[] nums) {
		int n = nums.length;
		int min = Integer.MAX_VALUE;
		int idx = -1;
		for (int i = 0; i < n; i++) {
			if (nums[i] < min) {
				min = nums[i];
				idx = i;

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
//Time Complexity : O(N)
//Space Complexity : O(1)

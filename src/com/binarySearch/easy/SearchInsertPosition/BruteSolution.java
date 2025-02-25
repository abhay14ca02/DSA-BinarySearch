package com.binarySearch.easy.SearchInsertPosition;

public class BruteSolution {
	private static int lowerBound(int[] nums, int target) {
		int n = nums.length;
		// compare target with each element in array
		for (int i = 0; i < n; i++) {
			// if equal or larger value found return its index
			if (nums[i] >= target) {
				return i;
			}
		}
		// if all elements are smaller, return length
		return n;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 4, 7 };
		int target = 6;
		int ans = lowerBound(nums, target);
		System.out.println(ans);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)
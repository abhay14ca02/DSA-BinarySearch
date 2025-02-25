package com.binarySearch.easy.UpperBound;

//The upper bound of a number is defined as the smallest index in the sorted array where the element is greater than the given number.
//i.e, nums[idx] > target
//Note: If all the elements in the given array are smaller than or equal to the target, the upper bound will be the length of the array.
public class BruteSolution {
	private static int upperBound(int[] nums, int target) {
		int n = nums.length;
		// Compare target with each element in array
		for (int i = 0; i < n; i++) {
			// If larger value found, return its index
			if (nums[i] > target) {
				return i;
			}
		}
		// If all elements are smaller, return length
		return n;
	}

	public static void main(String[] args) {

		int[] nums = { 2, 3, 7, 10, 11, 11, 25 };
		int target = 9;
		int ans = upperBound(nums, target);
		System.out.println(ans);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)
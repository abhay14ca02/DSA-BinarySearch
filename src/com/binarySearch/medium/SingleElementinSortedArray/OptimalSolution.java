package com.binarySearch.medium.SingleElementinSortedArray;

public class OptimalSolution {
	private static int singleNonDuplicate(int[] nums) {
		int n = nums.length;
		if (n == 1)
			return nums[0];
		if (nums[0] != nums[1])
			return nums[0];
		if (nums[n - 1] != nums[n - 2])
			return nums[n - 1];

		int low = 1;
		int high = n - 2;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			// If nums[mid] is the single element
			if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
				return nums[mid];
			}
			// We are in left
			if (mid % 2 == 1 && nums[mid] == nums[mid - 1] || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
				// Eliminate the left half
				low = mid + 1;
			} else {// We are in right
				// Eliminate the right half
				high = mid - 1;
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
//Time Complexity : O(LogN)
//Space Complexity : O(1)
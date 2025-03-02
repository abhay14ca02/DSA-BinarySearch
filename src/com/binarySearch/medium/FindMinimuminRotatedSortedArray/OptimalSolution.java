package com.binarySearch.medium.FindMinimuminRotatedSortedArray;

public class OptimalSolution {
	private static int findMin(int[] nums) {
		int n = nums.length;
		int low = 0;
		int high = n - 1;
		int ans = Integer.MAX_VALUE;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			// if left part is sorted
			if (nums[low] <= nums[mid]) {
				// keep the minimum
				ans = Math.min(ans, nums[low]);
				// Eliminate left half
				low = mid + 1;
			} else {// if right part is sorted
					// keep the minimum
				ans = Math.min(ans, nums[mid]);
				// Eliminate right half
				high = mid - 1;
			}

		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 4, 5, 1, 2 };
		int ans = findMin(nums);
		System.out.println(ans);
	}
}
//Time Complexity : O(LogN)
//Space Complexity : O(1)
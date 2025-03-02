package com.binarySearch.medium.SearchElementinRotatedSortedArrayI;

public class OptimalSolution {
	private static int searchRotatedSorted(int[] nums, int target) {
		int n = nums.length;
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			// if left part is sorted
			if (nums[low] <= nums[mid]) {
				if (nums[low] <= target && target <= nums[mid]) {
					// element exists
					high = mid - 1;
				} else {
					// element does not exist
					low = mid + 1;
				}
			} else {// if right part is sorted

				if (nums[mid] <= target && target <= nums[high]) {
					// element exists
					low = mid + 1;
				} else {
					// element does not exist
					high = mid - 1;
				}
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
//Time Complexity : O(LogN)
//Space Complexity : O(1)
package com.binarySearch.medium.SearchElementinRotatedSortedArrayII;

public class OptimalSolution {
	private static boolean searchRotatedSorted(int[] nums, int target) {
		int n = nums.length;
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			// if mid points the target
			if (nums[mid] == target) {
				return true;
			}
			// Edge case:
			if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
				low++;
				high--;
				continue;
			}
			// if left part is sorted
			if (nums[low] <= nums[mid]) {
				if (nums[low] <= target && target <= nums[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}

			} else {// if right part is sorted
				if (nums[mid] <= target && target <= nums[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
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
//Time Complexity : O(LogN)
//Space Complexity : O(1)
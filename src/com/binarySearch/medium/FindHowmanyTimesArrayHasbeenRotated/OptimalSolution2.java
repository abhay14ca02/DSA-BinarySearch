package com.binarySearch.medium.FindHowmanyTimesArrayHasbeenRotated;

//Further optimization
public class OptimalSolution2 {
	private static int findMin(int[] nums) {
		int n = nums.length;
		int low = 0;
		int high = n - 1;
		int ans = Integer.MAX_VALUE;
		int idx = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			// search space is already sorted
			// then nums[low] will always be
			// the minimum in that search space:
			if (nums[low] <= nums[high]) {
				if (nums[low] < ans) {
					ans = nums[low];
					idx = low;
				}
				break;
			}
			// if left part is sorted
			if (nums[low] <= nums[mid]) {
				// keep the minimum
				if (nums[low] < ans) {
					ans = nums[low];
					idx = low;
				}
				// Eliminate left half
				low = mid + 1;
			} else {// if right part is sorted
					// keep the minimum
				if (nums[mid] < ans) {
					ans = nums[low];
					idx = low;
				}
				// Eliminate right half
				high = mid - 1;
			}

		}
		return idx;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 4, 5, 1, 2 };
		int ans = findMin(nums);
		System.out.println(ans);
	}
}
//Time Complexity : O(LogN)
//Space Complexity : O(1)

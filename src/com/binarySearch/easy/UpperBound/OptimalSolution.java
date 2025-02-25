package com.binarySearch.easy.UpperBound;

//The upper bound of a number is defined as the smallest index in the sorted array where the element is greater than the given number.
//i.e, nums[idx] > target
//Note: If all the elements in the given array are smaller than or equal to the target, the upper bound will be the length of the array.
public class OptimalSolution {

	private static int upperBound(int[] nums, int target) {
		int n = nums.length;
		int ans = n;
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			// If nums[mid] > target, then nums[mid] can be
			// the upper bound so store mid in result and
			// search in left half, i.e. nums[lo...mid-1]
			if (nums[mid] > target) {
				ans = mid;
				high = mid - 1;
			} else {
				// If nums[mid] <= target, then upper bound
				// cannot lie in the range [lo...mid], so
				// search in right half, i.e. nums[mid+1...hi]
				low = mid + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, 7, 10, 11, 11, 25 };
		int target = 9;
		int ans = upperBound(nums, target);
		System.out.println(ans);
	}
}
//Time Complexity : O(LogN)
//Space Complexity : O(1)
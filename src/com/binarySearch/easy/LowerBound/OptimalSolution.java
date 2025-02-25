package com.binarySearch.easy.LowerBound;

public class OptimalSolution {
	private static int lowerBound(int[] nums, int target) {
		int n = nums.length;
		int ans = n;
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			// If nums[mid] >= target, then mid can be the lower bound, so update ans to mid
			// and search in left half, i.e. [lo...mid-1]
			if (nums[mid] >= target) {
				ans = mid;
				high = mid - 1;
			}
			// If arr[mid] < target, then lower bound cannot lie in the range [lo...mid] so
			// search in right half, i.e. [mid+1...hi]
			else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, 7, 10, 11, 11, 25 };
		int target = 9;
		int ans = lowerBound(nums, target);
		System.out.println(ans);
	}
}
//Time Complexity : O(LogN)
//Space Complexity : O(1)
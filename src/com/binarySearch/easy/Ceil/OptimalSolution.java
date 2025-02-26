package com.binarySearch.easy.Ceil;

//The ceiling of target is the smallest element in the nums greater than or equal to target( i.e. smallest element in the nums[idx] >= target).
public class OptimalSolution {
	private static int ceil(int[] nums, int target) {
		int n = nums.length;
		int low = 0;
		int high = n - 1;
		int ans = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			// maybe an answer
			if (nums[mid] >= target) {
				ans = nums[mid];
				// look for smaller index on the left
				high = mid - 1;
			} else {
				// look on the right
				low = mid + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 4, 4, 7, 8, 10 };
		int target = 5;
		int ans = ceil(nums, target);
		System.out.println(ans);
	}
}
//Time Complexity : O(LogN)
//Space Complexity : O(1)
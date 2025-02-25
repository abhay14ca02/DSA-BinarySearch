package com.binarySearch.easy.SearchInsertPosition;

//This problem can be solved by using the lower bound algorithm
public class OptimalSolution {

	private static int searchInsert(int[] nums, int target) {
		int n = nums.length;
		int low = 0;
		int high = n - 1;
		int ans = n;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			// maybe an answer
			if (nums[mid] >= target) {
				ans = mid;
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
		int[] nums = { 1, 3, 5, 6 };
		int target = 5;
		int ans = searchInsert(nums, target);
		System.out.println(ans);
	}
}
//Time Complexity : O(LogN)
//Space Complexity : O(1)
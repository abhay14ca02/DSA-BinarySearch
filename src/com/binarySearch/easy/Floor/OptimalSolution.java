package com.binarySearch.easy.Floor;

//The floor of target is the largest element in the nums which is smaller than or equal to target( i.e. largest element in the nums[idx] <= target).
public class OptimalSolution {
	private static int floor(int[] nums, int target) {
		int n = nums.length;
		int low = 0;
		int high = n - 1;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			// maybe an answer
			if (nums[mid] <= target) {
				ans = nums[mid];
				// look for smaller index on the left
				low = mid + 1;
			} else {
				high = mid - 1; // look on the right
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 4, 4, 7, 8, 10 };
		int target = 5;
		int ans = floor(nums, target);
		System.out.println(ans);
	}
}
//Time Complexity : O(LogN)
//Space Complexity : O(1)
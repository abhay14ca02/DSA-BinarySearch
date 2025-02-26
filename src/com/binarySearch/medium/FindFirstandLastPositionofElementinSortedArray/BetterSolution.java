package com.binarySearch.medium.FindFirstandLastPositionofElementinSortedArray;

public class BetterSolution {
	private static int[] searchRange(int[] nums, int target) {
		int n = nums.length;
		int firstPos = -1;
		int lastPos = -1;
		for (int i = 0; i < n; i++) {

			if (nums[i] == target) {
				if (firstPos == -1) {
					firstPos = i;
				}
				lastPos = i;
			}
		}
		int[] range = new int[2];
		range[0] = firstPos;
		range[1] = lastPos;
		return range;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		int[] range = searchRange(nums, target);
		for (int i = 0; i < range.length; i++) {
			System.out.print(range[i] + " ");
		}
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)
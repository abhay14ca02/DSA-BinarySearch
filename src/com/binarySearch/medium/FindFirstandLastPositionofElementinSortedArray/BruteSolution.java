package com.binarySearch.medium.FindFirstandLastPositionofElementinSortedArray;

public class BruteSolution {
	private static int[] searchRange(int[] nums, int target) {
		int n = nums.length;
		int[] range = new int[2];
		int firstPos = -1;
		for (int i = 0; i < n; i++) {
			if (nums[i] == target) {
				firstPos = i;
				break;
			}
		}
		if (firstPos == -1) {
			range[0] = -1;
			range[1] = -1;
		}
		int lastPos = -1;
		for (int i = n - 1; i >= 0; i--) {
			if (nums[i] == target) {
				lastPos = i;
				break;
			}
		}
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
//Time Complexity : O(N) + O(N) ---> O(2N)
//Space Complexity : O(1)
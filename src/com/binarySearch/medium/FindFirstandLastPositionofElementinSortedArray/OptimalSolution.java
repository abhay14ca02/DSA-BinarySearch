package com.binarySearch.medium.FindFirstandLastPositionofElementinSortedArray;

//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
public class OptimalSolution {
	private static int[] searchRange(int[] nums, int target) {
		int n = nums.length;
		int[] range = new int[2];
		int firstPos = firstPosition(nums, target, n);
		if (firstPos == -1) {
			range[0] = -1;
			range[1] = -1;
			return range;
		}
		int lastPos = lastPosition(nums, target, n);
		range[0] = firstPos;
		range[1] = lastPos;
		return range;
	}

	private static int lastPosition(int[] nums, int target, int n) {
		int low = 0;
		int high = n - 1;
		int lastPos = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				lastPos = mid;
				low = mid + 1;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return lastPos;
	}

	private static int firstPosition(int[] nums, int target, int n) {
		int low = 0;
		int high = n - 1;
		int firstPos = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				firstPos = mid;
				high = mid - 1;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return firstPos;
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
//Time Complexity : O(LogN) + O(LogN)----> O(2LogN)
//Space Complexity : O(1)
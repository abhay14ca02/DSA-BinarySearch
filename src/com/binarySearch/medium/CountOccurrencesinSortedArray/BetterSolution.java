package com.binarySearch.medium.CountOccurrencesinSortedArray;

public class BetterSolution {
	private static int countOccurrences(int[] nums, int target) {
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
		return lastPos - firstPos + 1;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		int count = countOccurrences(nums, target);
		System.out.println(count);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)
package com.binarySearch.medium.CountOccurrencesinSortedArray;

public class BruteSolution {
	private static int countOccurrences(int[] nums, int target) {
		int n = nums.length;
		int firstPos = -1;
		for (int i = 0; i < n; i++) {
			if (nums[i] == target) {
				firstPos = i;
				break;
			}
		}
		if (firstPos == -1) {
			return 0;
		}
		int lastPos = -1;
		for (int i = n - 1; i >= 0; i--) {
			if (nums[i] == target) {
				lastPos = i;
				break;
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
//Time Complexity : O(N) + O(N) ---> O(2N)
//Space Complexity : O(1)
package com.binarySearch.medium.CountOccurrencesinSortedArray;

public class OptimalSolution {
	private static int countOccurrences(int[] nums, int target) {
		int n = nums.length;
		int firstPos = firstOccurrence(nums, n, target);
		if (firstPos == -1) {
			return 0;
		}
		int secondPos = secondOcuurence(nums, n, target);
		return secondPos - firstPos + 1;
	}

	private static int secondOcuurence(int[] nums, int n, int target) {
		int low = 0;
		int high = n - 1;
		int secondPos = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				secondPos = mid;
				low = mid + 1;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return secondPos;
	}

	private static int firstOccurrence(int[] nums, int n, int target) {
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
		int[] nums = { 2, 2, 3, 3, 3, 3, 4 };
		int target = 3;
		int occurrences = countOccurrences(nums, target);
		System.out.println(occurrences);
	}
}
//Time Complexity : O(LogN) + O(LogN)----> O(2LogN)
//Space Complexity : O(1)

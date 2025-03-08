package com.binarySearch.medium.KthMissingPositiveNumber;

public class OptimalSolution {
	private static int findKthPositive(int[] arr, int k) {
		int n = arr.length;
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int missing = arr[mid] - (mid + 1);
			if (missing < k) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return k + high + 1;
		// either return low + k
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 7, 11 };
		int k = 5;
		int missing = findKthPositive(arr, k);
		System.out.println(missing);
	}
}
//Time Complexity : O(LogN)
//Space Complexity : O(1)
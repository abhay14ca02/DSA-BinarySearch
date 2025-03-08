package com.binarySearch.medium.KthMissingPositiveNumber;

public class BruteSolution {
	private static int findKthPositive(int[] arr, int k) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] <= k) {
				k++;
			} else {
				break;
			}
		}
		return k;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 7, 11 };
		int k = 5;
		int missing = findKthPositive(arr, k);
		System.out.println(missing);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)
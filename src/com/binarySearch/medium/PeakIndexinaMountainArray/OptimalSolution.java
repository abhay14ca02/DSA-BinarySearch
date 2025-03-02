package com.binarySearch.medium.PeakIndexinaMountainArray;

//A peak element in an array refers to the element that is greater than both of its neighbors. Basically, 
//if arr[i] is the peak element, arr[i] > arr[i-1] and arr[i] > arr[i+1].
public class OptimalSolution {
	private static int peakIndexInMountainArray(int[] arr) {

		int n = arr.length;
		if (n == 1) {
			return arr[0];
		}
		if (arr[0] > arr[1]) {
			return arr[0];
		}
		if (arr[n - 1] > arr[n - 2]) {
			return arr[n - 1];
		}
		int low = 1;
		int high = n - 2;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
				return mid;
			} else if (arr[mid] > arr[mid - 1]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 5, 1 };
		int ans = peakIndexInMountainArray(arr);
		System.out.println(ans);
	}

}
//Time Complexity : O(LogN)
//Space Complexity : O(1)
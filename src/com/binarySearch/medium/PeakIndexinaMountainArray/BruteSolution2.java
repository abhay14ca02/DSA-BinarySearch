package com.binarySearch.medium.PeakIndexinaMountainArray;

//A peak element in an array refers to the element that is greater than both of its neighbors. Basically, 
//if arr[i] is the peak element, arr[i] > arr[i-1] and arr[i] > arr[i+1].
public class BruteSolution2 {
	private static int peakIndexInMountainArray(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0 };
		int ans = peakIndexInMountainArray(arr);
		System.out.println(ans);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)
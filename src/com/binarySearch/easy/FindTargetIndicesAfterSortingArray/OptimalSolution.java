package com.binarySearch.easy.FindTargetIndicesAfterSortingArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptimalSolution {
	private static List<Integer> targetIndices(int[] nums, int target) {
		Arrays.sort(nums);
		int n = nums.length;
		List<Integer> range = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if (nums[i] == target) {
				range.add(i);
			}
		}
		return range;

	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 5, 2, 3 };
		int target = 2;
		List<Integer> range = targetIndices(nums, target);
		System.out.println(range);
	}
}
//Time Complexity : O(NLogN) + O(N)
//Space Complexity :  O(1)
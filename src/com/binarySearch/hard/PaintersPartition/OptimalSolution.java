package com.binarySearch.hard.PaintersPartition;

public class OptimalSolution {
	private static int findLargestMinDistance(int[] boards, int k) {
		int n = boards.length;
		int max = Integer.MIN_VALUE;
		int cumSum = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, boards[i]);
			cumSum += boards[i];
		}
		int low = max;
		int high = cumSum;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (countPainters(boards, mid) <= k) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	private static int countPainters(int[] boards, int mid) {
		int n = boards.length;
		int painters = 1;
		long boardPainters = 0;
		for (int i = 0; i < n; i++) {
			if (boardPainters + boards[i] <= mid) {
				// allocate board to current painter
				boardPainters += boards[i];
			} else {
				// allocate board to next painter
				painters++;
				boardPainters = boards[i];
			}
		}
		return painters;
	}

	public static void main(String[] args) {
		int[] boards = { 10, 20, 30, 40 };
		int k = 2;
		int ans = findLargestMinDistance(boards, k);
		System.out.println(ans);
	}
}
//Time Complexity: O(N * log(sum(arr[])-max(arr[])+1))
//Space Complexity: O(1)
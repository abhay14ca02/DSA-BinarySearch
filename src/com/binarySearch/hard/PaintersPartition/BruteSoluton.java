package com.binarySearch.hard.PaintersPartition;

public class BruteSoluton {
	private static int findLargestMinDistance(int[] boards, int k) {
		int n = boards.length;
		int max = Integer.MIN_VALUE;
		int totalSum = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, boards[i]);
			totalSum += boards[i];
		}
		for (int time = max; time <= totalSum; time++) {
			if (countPainters(boards, time) <= k) {
				return time;
			}
		}
		return max;
	}

	private static int countPainters(int[] boards, int time) {
		int n = boards.length;
		int painters = 1;
		long boardPainters = 0;
		for (int i = 0; i < n; i++) {
			if (boardPainters + boards[i] <= time) {
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
//Time Complexity: O(N * (sum(boards[])-max(boards[])+1))
//Space Complexity:  O(1)

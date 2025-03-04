package com.binarySearch.medium.GuessNumberHigherorLower;

public class OptimalSolution {
	private static int guessNumber(int n, int pick) {
		int low = 1;
		int high = n;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int val = guess(mid, pick);
			if (val == 0) {
				return mid;
			} else if (val == -1) {
				high = mid - 1;
			} else if (val == 1) {
				low = mid + 1;
			}
		}
		return -1;
	}

	private static int guess(int mid, int pick) {
		if (mid > pick) {
			return -1;
		} else if (mid < pick) {
			return 1;
		} else if (mid == pick) {
			return 0;
		}
		return -1;
	}

	public static void main(String[] args) {
		int n = 10;
		int pick = 6;
		int guessNo = guessNumber(n, pick);
		System.out.println(guessNo);
	}

}
//Time Complexity : O(LogN)
//Space Complexity : O(1)
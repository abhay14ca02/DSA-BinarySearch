package com.binarySearch.hard.BookAllocation;

public class OptimalSolution {
	private static int allocatePages(int[] pages, int m) {
		int n = pages.length;
		// book allocation impossible
		if (m > n) {
			return -1;
		}
		int maxPages = Integer.MIN_VALUE;
		int totalPages = 0;
		for (int i = 0; i < n; i++) {
			maxPages = Math.max(maxPages, pages[i]);
			totalPages = totalPages + pages[i];
		}
		int low = maxPages;
		int high = totalPages;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;

			int students = countStudents(pages, mid);
			if (students <= m) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	private static int countStudents(int[] pages, int mid) {
		int n = pages.length;
		int student = 1;
		long pagesStudent = 0;
		for (int i = 0; i < n; i++) {
			if (pagesStudent + pages[i] <= mid) {
				// add pages to current student
				pagesStudent += pages[i];
			} else {
				// add pages to next student
				student++;
				pagesStudent = pages[i];
			}
		}
		return student;
	}

	public static void main(String[] args) {
		int[] pages = { 25, 46, 28, 49, 24 };
		int m = 4;// No. of students
		int ans = allocatePages(pages, m);
		System.out.println(ans);
	}
}
//Time Complexity: O(N * log(sum(pages[])-max(pages[])+1))
//Space Complexity:  O(1) 

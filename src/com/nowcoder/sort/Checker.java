package com.nowcoder.sort;

/**
 * 重复值判断练习题
 * 
 * @author Yanqiang
 * @date Mar 24, 2017 4:26:22 PM
 * @Description 题目：<br>
 *              请设计一个高效算法，判断数组中是否有重复值。必须保证额外空间复杂度为O(1)。<br>
 */
public class Checker {
	/**
	 * 如果没有空间复杂度限制，应当用哈希表来实现，空间、时间复杂度O(N)。<br>
	 * 递归版本的堆排序空间复杂度为O(logN)。正比于堆的层数。<br>
	 * 正确解法为非递归版本的堆排序。<br>
	 * 
	 * @param a
	 *            待判断重复的数组
	 * @param n
	 *            数组大小
	 * @return 是否有重复值
	 */
	public boolean checkDuplicate(int[] a, int n) {
		int length = n;
		n--;
		for (int i = n / 2; i >= 0; i--) {
			sink(a, n, i);
		}
		while (n > 0) {
			swap(a, 0, n);
			n--;
			sink(a, n, 0);
		}
		boolean result = false;
		for (int i = 0; i < length - 1; i++) {
			if (a[i] == a[i + 1])
				result = true;
		}
		return result;
	}

	private void sink(int[] A, int n, int k) {
		while (2 * k <= n) {
			int j = 2 * k;
			if (j < n && A[j + 1] > A[j])
				j = j + 1;
			if (A[j] <= A[k])
				break;
			swap(A, j, k);
			k = j;
		}
	}

	private void swap(int[] A, int num1, int num2) {
		int temp = A[num1];
		A[num1] = A[num2];
		A[num2] = temp;
	}
}

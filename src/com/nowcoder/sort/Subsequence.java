package com.nowcoder.sort;

/**
 * 最短子数组练习题
 * 
 * @author Yanqiang
 * @date Mar 24, 2017 5:13:27 PM
 * @Description 题目：<br>
 *              对于一个数组，请设计一个高效算法计算需要排序的最短子数组的长度。<br>
 */
public class Subsequence {
	/**
	 * 从左向右遍历，记录最大值，当有元素值比最大值小，记录其位置。<br>
	 * 再从右向左遍历，记录最小值，当有元素值比最小值大时，记录其位置。<br>
	 * 这两个位置就是子数组区间的端点。<br>
	 * 时间复杂度O(N)，空间复杂度O(1)。<br>
	 * 
	 * @param A
	 *            待排序数组
	 * @param n
	 *            数组长度
	 * @return 需要排序的子数组长度
	 */
	public int shortestSubsequence(int[] A, int n) {
		int max = A[0], min = A[n - 1];
		int right = 0, left = 1;
		for (int i = 1; i < n; i++) {
			if (A[i] > max)
				max = A[i];
			else if (A[i] < max)
				right = i;
		}
		for (int i = n - 2; i >= 0; i--) {
			if (A[i] < min)
				min = A[i];
			else if (A[i] > min)
				left = i;
		}
		return right - left + 1;
	}
}

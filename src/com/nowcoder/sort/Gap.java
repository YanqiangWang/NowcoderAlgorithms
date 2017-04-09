package com.nowcoder.sort;

/**
 * 相邻两数最大差值练习题
 * 
 * @author Yanqiang
 * @date Mar 24, 2017 5:14:24 PM
 * @Description 题目：<br>
 *              有一个整形数组A，请设计一个复杂度为O(n)的算法，算出排序后相邻两数的最大差值。<br>
 */
public class Gap {
	/**
	 * 算法思路来自桶排序。<br>
	 * 先找出最大值、最小值，计算出差值，并划分出N个区间。<br>
	 * 然后比较每个非空桶中的最大值和后一个非空桶中的最小值的差值即可。<br>
	 * 时间复杂度，空间复杂度：O(N)。<br>
	 * 
	 * @param A
	 *            数组
	 * @param n
	 *            数组长度
	 * @return 相邻两数的最大差值
	 */
	public int maxGap(int[] A, int n) {
		int max = A[0], min = A[0];
		for (int i = 0; i < n; i++) {
			if (A[i] > max)
				max = A[i];
			if (A[i] < min)
				min = A[i];
		}
		int[] bucket = new int[max - min + 1];
		for (int i = 0; i < n; i++) {
			bucket[A[i] - min]++;
		}
		int left = 0, right = 0, gap = 0;
		for (int i = 0; i < max - min + 1; i++) {
			if (bucket[i] != 0) {
				right = i;
				if (right - left > gap) {
					gap = right - left;
				}
				left = i;
			}
		}
		return gap;
	}
}

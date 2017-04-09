package com.nowcoder.sort;

/**
 * 有序数组合并练习题
 * 
 * @author Yanqiang
 * @date Mar 24, 2017 4:28:08 PM
 * @Description 题目：<br>
 *              有两个从小到大排序以后的数组A和B，其中A的末端有足够的缓冲空容纳B。请编写一个方法，将B合并入A并排序。<br>
 */
public class Merge {
	/**
	 * 从后往前比较两个数组，并覆盖A数组末端。<br>
	 * 
	 * @param A
	 *            数组A
	 * @param B
	 *            数组B
	 * @param n
	 *            数组A的大小
	 * @param m
	 *            数组B的大小
	 * @return 合并后的数组
	 */
	public int[] mergeAB(int[] A, int[] B, int n, int m) {
		int AIndex = n - 1, BIndex = m - 1;
		for (int i = n + m - 1; i >= 0; i--) {
			if (BIndex >= 0 && AIndex >= 0)
				if (A[AIndex] < B[BIndex]) {
					A[i] = B[BIndex--];
				} else {
					A[i] = A[AIndex--];
				}
		}
		if (BIndex >= 0) {
			for (int i = 0; i < BIndex + 1; i++)
				A[i] = B[i];
		}
		return A;
	}
}

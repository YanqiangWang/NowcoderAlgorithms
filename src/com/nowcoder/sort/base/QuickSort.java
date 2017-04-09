package com.nowcoder.sort.base;

import java.util.Random;

/**
 * 快速排序
 * 
 * @author Yanqiang
 * @date Mar 22, 2017 6:06:25 PM
 * @Description 时间复杂度：O(N*logN)<br>
 *              空间复杂度：O(logN)~O(N)<br>
 *              不稳定排序<br>
 *              在最好情况下，它的渐进复杂度与堆排序和归并排序相同，只是常量系数较小。<br>
 */
public class QuickSort {
	/**
	 * 在数组中随机选择一个数，小于它的数放在左边，大于大的数放在右边。<br>
	 * 然后对于左右两个部分递归调用此过程。<br>
	 * 划分过程Partition：（时间复杂度O(n)）<br>
	 * 首先将划分值与最后一个元素互换，然后建立一个小于等于区间。<br>
	 * 依次遍历数组元素，如果符合条件，加入到区间中。<br>
	 * 直到所有元素完成遍历，此时划分值也加入到了区间中。<br>
	 * 
	 * @param A
	 *            数组名
	 * @param n
	 *            数组长度
	 * @return 排序后的数组A
	 */
	public int[] quickSort(int[] A, int n) {
		quickSort(A, 0, n);
		return A;
	}

	private void quickSort(int[] A, int left, int right) {
		// 递归基
		if (right - left <= 1)
			return;
		int rad = new Random().nextInt(right - left); // 随机数
		int num = A[rad + left]; // 划分值
		int leftCopied = left;
		swap(A, left + rad, right - 1);
		for (int i = left; i < right; i++) {
			if (A[i] <= num) {
				swap(A, i, left);
				left++;
			}
		}
		// 递归
		quickSort(A, leftCopied, left - 1);
		quickSort(A, left, right);
	}

	private void swap(int[] A, int num1, int num2) {
		int temp = A[num1];
		A[num1] = A[num2];
		A[num2] = temp;
	}
}

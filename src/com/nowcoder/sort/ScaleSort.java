package com.nowcoder.sort;

/**
 * 小范围排序练习题
 * 
 * @author Yanqiang
 * @date Mar 24, 2017 4:21:52 PM
 * @Description 题目：<br>
 *              已知一个几乎有序的数组。几乎有序是指，如果把数组排好顺序的话，每个元素移动的距离可以不超过k，并且k相对于数组来说比较小。
 *              请选择一个合适的排序算法针对这个数据进行排序。<br>
 */
public class ScaleSort {
	/**
	 * 较好的方法：插入排序，时间复杂度O(N*K)<br>
	 * 正确解法：改进后的堆排序。时间复杂度O(N*logK)，思路如下：<br>
	 * 最小值一定在A[0] ~ A[k - 1]中，这k个数组成小根堆。<br>
	 * 将堆顶弹出放在数组A[0]处，再将A[k]放入小根堆顶，调整后弹出堆顶元素。<br>
	 * 依此类推，最后再将小根堆中所有数弹出。<br>
	 * 
	 * @param A
	 *            给定数组
	 * @param n
	 *            数组长度
	 * @param k
	 *            移动最大距离
	 * @return 已排序的数组A
	 */
	public int[] sortElement(int[] A, int n, int k) {
		// 新建数组，复制元素值
		int[] heap = new int[k];
		for (int i = 0; i < k; i++) {
			heap[i] = A[i];
		}
		// 建小根堆
		k--;
		for (int i = k / 2; i >= 0; i--) {
			sink(heap, k, i);
		}
		// 依次弹出元素
		for (int i = 0; i < n; i++) {
			A[i] = heap[0];
			// 加入新元素到堆中
			if (i + k + 1 < n) {
				heap[0] = A[i + k + 1];
			}
			// 无元素可添加，弹出剩余元素
			else {
				heap[0] = heap[n - i - 1];
				k--;
			}
			sink(heap, k, 0);
		}
		return A;
	}

	private void sink(int[] A, int n, int k) {
		while (2 * k <= n) {
			int j = 2 * k;
			if (j < n && A[j + 1] < A[j])
				j = j + 1;
			if (A[j] >= A[k])
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

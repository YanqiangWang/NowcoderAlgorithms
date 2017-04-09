package com.nowcoder.sort.base;

/**
 * 堆排序
 * 
 * @author Yanqiang
 * @date Mar 22, 2017 6:06:38 PM
 * @Description 时间复杂度：O(N*logN)<br>
 *              空间复杂度：O(1)<br>
 *              不稳定排序<br>
 */
public class HeapSort {
	/**
	 * 将数组元素建成大根堆，将堆顶元素与最后一个元素交换后脱离堆。<br>
	 * 然后将堆调整为规模为n-1的大根堆，然后重复以上过程，直到所有元素都脱离堆，即完成排序。<br>
	 * 
	 * @param A
	 *            数组名
	 * @param n
	 *            数组长度
	 * @return 排序后的数组A
	 */
	public int[] heapSort(int[] A, int n) {
		// 建造大根堆
		n--;
		for (int i = n / 2; i >= 0; i--) {
			sink(A, n, i);
		}
		while (n > 0) {
			swap(A, 0, n);
			n--;
			sink(A, n, 0);
		}
		return A;
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

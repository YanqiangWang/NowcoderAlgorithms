package com.nowcoder.sort.base;

/**
 * 冒泡排序
 * 
 * @author Yanqiang
 * @date Mar 22, 2017 5:00:09 PM
 * @Description 时间复杂度：O(N^2)<br>
 *              空间复杂度：O(1)<br>
 *              稳定排序<br>
 */
public class BubbleSort {
	/**
	 * 遍历k: 0 ~ n-1，比较A[k]与A[k+1]。如果A[k] &gt; A[k + 1]，交换元素值。<br>
	 * 缩小范围k: 0 ~ n-2，继续如上操作，依此类推，直到k的范围缩小到0。<br>
	 * 
	 * @param A
	 *            数组名
	 * @param n
	 *            数组长度
	 * @return 排序后的数组A
	 */
	public int[] bubbleSort(int[] A, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int k = 0; k < n - i - 1; k++) {
				if (A[k] > A[k + 1]) {
					swap(A, k, k + 1);
				}
			}
		}
		return A;
	}

	private void swap(int[] A, int num1, int num2) {
		int temp = A[num1];
		A[num1] = A[num2];
		A[num2] = temp;
	}
}

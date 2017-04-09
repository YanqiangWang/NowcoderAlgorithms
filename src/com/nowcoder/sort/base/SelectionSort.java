package com.nowcoder.sort.base;

/**
 * 选择排序
 * 
 * @author Yanqiang
 * @date Mar 22, 2017 5:14:34 PM
 * @Description 时间复杂度：O(N^2)<br>
 *              空间复杂度：O(1)<br>
 *              不稳定排序<br>
 */
public class SelectionSort {
	/**
	 * 从数组A：0 ~ n-1 中选出最小的元素值，然后与A[0]交换。<br>
	 * 再从A：1 ~ n-1中选出最小的元素值，然后与A[1]交换。<br>
	 * 逐渐缩小查询范围，以此类推，直到所有元素都完成排序。<br>
	 * 
	 * @param A
	 *            数组名
	 * @param n
	 *            数组长度
	 * @return 排序后的数组A
	 */
	public int[] selectionSort(int[] A, int n) {
		for (int i = 0; i < n - 1; i++) {
			int min = A[i]; // 设置此轮排序中最小值为第一个元素的值
			int minIndex = i;
			// 找出值最小的元素
			for (int j = i + 1; j < n; j++) {
				if (A[j] < min) {
					min = A[j];
					minIndex = j;
				}
			}
			// 交换
			if (minIndex != i) {
				swap(A, i, minIndex);
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

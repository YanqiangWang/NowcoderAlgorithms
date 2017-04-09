package com.nowcoder.sort.base;

/**
 * 归并排序
 * 
 * @author Yanqiang
 * @date Mar 22, 2017 6:03:55 PM
 * @Description 时间复杂度：O(N*logN)<br>
 *              空间复杂度：O(N)<br>
 *              稳定排序<br>
 * 
 */
public class MergeSort {
	/**
	 * 将元素依次两两比较排序，而后合并为一个区间。<br>
	 * 将区间依次两两比较排序，而后再合并为一个区间。<br>
	 * 依次类推，直到所有元素合并为一个区间，则所有元素已排序。<br>
	 * 
	 * @param A
	 *            数组名
	 * @param n
	 *            数组长度
	 * @return 排序后的数组A
	 */
	public int[] mergeSort(int[] A, int n) {
		mergeSort(A, 0, n / 2, n);
		return A;
	}

	private void mergeSort(int[] A, int left, int mid, int right) {
		// 递归基
		if (right - left <= 1)
			return;
		// 分组递归
		mergeSort(A, left, (left + mid) / 2, mid);
		mergeSort(A, mid, (right + mid) / 2, right);
		// 合并排序
		sort(A, left, mid, right);
	}

	private void sort(int[] A, int left, int right, int rightEnd) {
		int[] result = new int[rightEnd - left]; // 存储数组
		int index = 0; // 存储数组的指针索引
		int leftEnd = right;
		while (left < leftEnd && right < rightEnd) {
			if (A[left] < A[right]) {
				result[index] = A[left];
				left++;
			} else {
				result[index] = A[right];
				right++;
			}
			index++;
		}
		for (; left < leftEnd; left++, index++)
			result[index] = A[left];
		for (; right < rightEnd; right++, index++)
			result[index] = A[right];
		// 复制数组
		for (int i = index; i > 0; i--)
			A[rightEnd - i] = result[index - i];
	}
}

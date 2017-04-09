package com.nowcoder.sort.base;

/**
 * 插入排序
 * 
 * @author Yanqiang
 * @date Mar 22, 2017 5:40:33 PM
 * @Description 时间复杂度：O(N^2)<br>
 *              空间复杂度：O(1)<br>
 *              稳定排序<br>
 */
public class InsertionSort {
	/**
	 * 将A[1]与A[0]比较，如果A[0] &gt; A[1]，则交换元素值。<br>
	 * 将A[2]先与A[1]比较，再与A[0]比较，如果A[2]较小，则依次交换元素值。<br>
	 * 如果A[2]不比它前面的元素小，则停止交换。<br>
	 * 依此类推，直到最后一个元素完成与其之前元素的比较。<br>
	 * 
	 * @param A
	 *            数组名
	 * @param n
	 *            数组长度
	 * @return 排序后的数组A
	 */
	public int[] insertionSort(int[] A, int n) {
		for (int i = 1; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (A[j - 1] > A[j]) {
					swap(A, j, j - 1);
				} else
					break;
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

package com.nowcoder.sort.base;

/**
 * 希尔排序
 * 
 * @author Yanqiang
 * @date Mar 22, 2017 6:06:50 PM
 * @Description 时间复杂度：O(N*logN)<br>
 *              空间复杂度：O(1)<br>
 *              不稳定排序<br>
 */
public class ShellSort {
	/**
	 * 类似插入排序，但初始步长大于1，逐步调整。<br>
	 * 然后缩小步长，再次调整，依此类推，最后进行的是步长为1的调整。<br>
	 * 希尔排序的关键在于步长的选择，选择得好接近O(N*logN)，选得不好接近O(N^2)。<br>
	 * 
	 * @param A
	 *            数组名
	 * @param n
	 *            数组长度
	 * @return 排序后的数组A
	 */
	public int[] shellSort(int[] A, int n) {
		int feet = n / 2;
		while (feet > 0) {
			for (int i = feet; i < n; i++) {
				for (int j = i - feet; j >= 0; j -= feet) {
					if (A[j] > A[j + feet])
						swap(A, j, j + feet);
				}
			}
			feet--;
		}
		return A;
	}

	private void swap(int[] A, int num1, int num2) {
		int temp = A[num1];
		A[num1] = A[num2];
		A[num2] = temp;
	}
}

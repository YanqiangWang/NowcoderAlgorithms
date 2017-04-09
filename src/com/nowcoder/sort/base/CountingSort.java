package com.nowcoder.sort.base;

/**
 * 计数排序
 * 
 * @author Yanqiang
 * @date Mar 24, 2017 3:12:56 PM
 * @Description 基于桶排序<br>
 *              时间复杂度：O(N)<br>
 *              <br>
 *              空间复杂度：O(M)<br>
 *              稳定排序<br>
 */
public class CountingSort {
	/**
	 * 根据数值范围建立桶，并将待排序的元素依次加入桶中。<br>
	 * 只后，将元素依次倒出，即排序完毕。<br>
	 * 
	 * @param A
	 *            数组名
	 * @param n
	 *            数组长度
	 * @return 排序后的数组A
	 */
	public int[] countingSort(int[] A, int n) {
		// 找出最大最小值，建桶
		int max = A[0], min = A[0];
		for (int i = 0; i < n; i++) {
			if (A[i] > max)
				max = A[i];
			if (A[i] < min)
				min = A[i];
		}
		int[] bucket = new int[max - min + 1]; // 元素已默认初始化为0
		// 入桶排序
		for (int i = 0; i < n; i++) {
			bucket[A[i] - min]++;
		}
		// 出桶
		int index = 0;
		for (int i = 0; i < max - min + 1; i++) {
			while (bucket[i] != 0) {
				A[index++] = i + min;
				bucket[i]--;
			}
		}
		return A;
	}
}

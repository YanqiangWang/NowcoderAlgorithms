package com.nowcoder.sort.base;

/**
 * 基数排序
 * 
 * @author Yanqiang
 * @date Mar 24, 2017 3:12:26 PM
 * @Description 基于桶排序<br>
 *              时间复杂度O(N)<br>
 *              空间复杂度：O(M)<br>
 *              稳定排序<br>
 */
public class RadixSort {
	/**
	 * 将所有元素按照个位大小依次进桶，倒出后再按照十位大小进桶。<br>
	 * 以此类推，直到按照最高位大小进桶后，倒出即完成排序。<br>
	 * 
	 * @param A
	 *            数组名
	 * @param n
	 *            数组长度
	 * @return 排序后的数组A
	 */
	public int[] radixSort(int[] A, int n) {
		// 建桶
		int[][] bucket = new int[10][n];
		int[] count = new int[10];
		// 确定最大值的位数
		int max = A[0];
		for (int i = 0; i < n; i++)
			if (A[i] > max)
				max = A[i];
		int length = 0;
		while (max > 0) {
			max /= 10;
			length++;
		}
		// 循环入桶，出桶
		int num = 10;
		while (length-- != 0) {
			for (int i = 0; i < n; i++) {
				int remain = A[i] % num / (num / 10);
				bucket[remain][count[remain]++] = A[i];
			}
			int index = 0;
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < count[i]; j++)
					A[index++] = bucket[i][j];
			}
			num *= 10;
			count = new int[10];
			bucket = new int[10][n];
		}
		return A;
	}
}

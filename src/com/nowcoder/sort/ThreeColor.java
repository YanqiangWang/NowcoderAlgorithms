package com.nowcoder.sort;

/**
 * 三色排序练习题
 * 
 * @author Yanqiang
 * @date Mar 24, 2017 5:11:41 PM
 * @Description 题目：<br>
 *              荷兰国旗问题。<br>
 *              有一个只由0，1，2三种元素构成的整数数组，请使用交换、原地排序而不是使用计数进行排序。<br>
 */
public class ThreeColor {
	/**
	 * 类似快排的划分过程，时间复杂度O(N)，空间复杂度O(1)。<br>
	 * 左右两侧设置两个区间，遍历元素，加入区间中。<br>
	 * 
	 * @param A
	 *            待排序数组
	 * @param n
	 *            数组大小
	 * @return 排序后的数组
	 */
	public int[] sortThreeColor(int[] A, int n) {
		int left = 0, right = n - 1;
		int index = 0;
		while (index < right + 1) {
			if (A[index] == 0) {
				swap(A, index, left);
				left++;
				if (left > index)
					index = left;
			} else if (A[index] == 2) {
				swap(A, index, right);
				right--;
			} else
				index++;
		}
		return A;
	}

	private void swap(int[] A, int num1, int num2) {
		int temp = A[num1];
		A[num1] = A[num2];
		A[num2] = temp;
	}
}

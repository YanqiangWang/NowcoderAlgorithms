package com.nowcoder.sort;

/**
 * 有序矩阵查找练习题
 * 
 * @author Yanqiang
 * @date Mar 24, 2017 5:12:44 PM
 * @Description 题目：<br>
 *              现在有一个行和列都排好序的矩阵，请设计一个高效算法，快速查找矩阵中是否含有值x。<br>
 */
public class Finder {
	/**
	 * 算法思路举例如下：<br>
	 * 0 1 2 5<br>
	 * 2 3 4 7<br>
	 * 4 4 4 7<br>
	 * 5 7 7 9<br>
	 * 从右上开始查找，如果当前数大于3，则向左查找。<br>
	 * 如果当前数小于3，则向下查找。依此类推。<br>
	 * 时间复杂度O(m + n)，空间复杂度O(1)。<br>
	 * 
	 * @param mat
	 *            已排序矩阵
	 * @param n
	 *            行数
	 * @param m
	 *            列数
	 * @param x
	 *            待查找值
	 * @return 矩阵中是否包含x
	 */
	public boolean findX(int[][] mat, int n, int m, int x) {
		int row = 0, col = m - 1;
		while (row < n && col >= 0) {
			if (mat[row][col] == x)
				return true;
			else if (mat[row][col] > x)
				col--;
			else if (mat[row][col] < x)
				row++;
		}
		return false;
	}
}

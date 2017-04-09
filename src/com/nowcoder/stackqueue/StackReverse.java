package com.nowcoder.stackqueue;

/**
 * 栈的反转练习题
 * 
 * @author Yanqiang
 * @date Apr 8, 2017 1:18:53 AM
 * @Description 题目：<br>
 *              实现一个栈的逆序，但是只能用递归函数和这个栈本身的pop操作来实现，而不能自己申请另外的数据结构。<br>
 */
public class StackReverse {
	/**
	 * 
	 * @param A
	 *            给定的栈
	 * @param n
	 *            栈大小
	 * @return 逆序后的栈
	 */
	public int[] reverseStack(int[] A, int n) {
		int temp = A[n - 1];
		if (A == null || n < 2)
			return A;
		reverseStack(A, n - 1);
		return A;
	}
}

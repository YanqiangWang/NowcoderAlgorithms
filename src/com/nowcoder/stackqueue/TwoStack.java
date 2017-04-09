package com.nowcoder.stackqueue;

import java.util.Stack;

/**
 * 双栈队列练习题
 * 
 * @author Yanqiang
 * @date Apr 8, 2017 1:02:58 AM
 * @Description 题目：<br>
 *              编写一个类,只能用两个栈结构实现队列,支持队列的基本操作(push，pop)。<br>
 */
public class TwoStack {
	/**
	 * 题目解释：<br>
	 * 元素为正数代表push，0代表pop<br>
	 * 
	 * @param ope
	 *            操作序列
	 * @param n
	 *            序列长度
	 * @return 结果序列
	 */
	public int[] twoStack(int[] ope, int n) {
		// 计算结果数组的长度
		int len = 0;
		for (int i = 0; i < ope.length; i++) {
			if (ope[i] == 0)
				len++;
		}
		int[] result = new int[len];
		len = 0;
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		for (int i = 0; i < n; i++) {
			if (ope[i] == 0 && ope.length > 0) {
				// 倒入2栈中
				while (!stack1.isEmpty()) {
					stack2.push(stack1.pop());
				}
				result[len++] = stack2.pop();
				// 倒回1栈中
				while (!stack2.isEmpty()) {
					stack1.push(stack2.pop());
				}
			} else {
				stack1.push(ope[i]);
			}
		}
		return result;
	}
}

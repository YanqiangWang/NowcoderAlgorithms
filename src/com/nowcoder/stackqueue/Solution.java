package com.nowcoder.stackqueue;

import java.util.Stack;

/**
 * 可查询最值的栈练习题
 * 
 * @author Yanqiang
 * @date Apr 7, 2017 7:01:50 PM
 * @Description 题目：<br>
 *              定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。<br>
 */
public class Solution {

	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> min = new Stack<Integer>();

	public void push(int node) {
		stack.push(node);
		if (min.isEmpty() || min.peek() > node) {
			min.push(node);
		} else {
			min.push(min.peek());
		}
	}

	public void pop() {
		min.pop();
		stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int min() {
		return min.peek();
	}
}
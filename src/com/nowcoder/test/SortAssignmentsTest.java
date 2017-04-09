package com.nowcoder.test;

import org.junit.Assert;
import org.junit.Test;

import com.nowcoder.sort.*;

/**
 * 排序相关算法面试题的测试类
 * 
 * @author Yanqiang
 * @date Mar 24, 2017 7:00:21 PM
 * @Description
 */
public class SortAssignmentsTest {
	@Test
	public void mergeTest() {
		Merge test = new Merge();
		int[] A = new int[5];
		A[0] = 2;
		A[1] = 3;
		A[2] = 5;
		int[] B = new int[2];
		B[0] = 1;
		B[1] = 4;
		Assert.assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, test.mergeAB(A, B, 3, 2));
	}

	@Test
	public void scaleSortTest() {
		ScaleSort sort = new ScaleSort();
		int[] A = { 2, 1, 4, 3, 6, 5, 8, 7, 10, 9 };
		int n = 10;
		int k = 2;
		int[] expecteds = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Assert.assertArrayEquals(expecteds, sort.sortElement(A, n, k));
	}

	@Test
	public void threeColorTest() {
		ThreeColor test = new ThreeColor();
		int[] A = { 0, 1, 1, 0, 2, 2 };
		int n = 6;
		int[] expecteds = { 0, 0, 1, 1, 2, 2 };
		Assert.assertArrayEquals(expecteds, test.sortThreeColor(A, n));
	}
}

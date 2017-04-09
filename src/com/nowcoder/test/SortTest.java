package com.nowcoder.test;

import org.junit.Assert;
import org.junit.Test;

import com.nowcoder.sort.base.*;

/**
 * 排序方法测试类
 * 
 * @author Yanqiang
 * @date Mar 24, 2017 3:32:00 PM
 * @Description 在工程上，常用综合排序：<br>
 *              数组较小时，插入排序。<br>
 *              数组较大时，快速排序或其他O(N*logN)的排序。<br>
 */
public class SortTest {
	int[] A = { 54, 35, 48, 36, 27, 12, 44, 44, 8, 14, 26, 17, 28 };
	int[] expecteds = { 8, 12, 14, 17, 26, 27, 28, 35, 36, 44, 44, 48, 54 };
	int n = A.length;

	@Test
	public void bubbleSortTest() {
		BubbleSort sort = new BubbleSort();
		Assert.assertArrayEquals(expecteds, sort.bubbleSort(A, n));
	}

	@Test
	public void selectionSortTest() {
		SelectionSort sort = new SelectionSort();
		Assert.assertArrayEquals(expecteds, sort.selectionSort(A, n));
	}

	@Test
	public void insertionSortTest() {
		InsertionSort sort = new InsertionSort();
		Assert.assertArrayEquals(expecteds, sort.insertionSort(A, n));
	}

	@Test
	public void mergeSortTest() {
		MergeSort sort = new MergeSort();
		Assert.assertArrayEquals(expecteds, sort.mergeSort(A, n));
	}

	@Test
	public void quickSortTest() {
		QuickSort sort = new QuickSort();
		Assert.assertArrayEquals(expecteds, sort.quickSort(A, n));
	}

	@Test
	public void shellSortTest() {
		ShellSort sort = new ShellSort();
		Assert.assertArrayEquals(expecteds, sort.shellSort(A, n));
	}

	@Test
	public void heapSortTest() {
		HeapSort sort = new HeapSort();
		Assert.assertArrayEquals(expecteds, sort.heapSort(A, n));
	}

	@Test
	public void countingSortTest() {
		CountingSort sort = new CountingSort();
		Assert.assertArrayEquals(expecteds, sort.countingSort(A, n));
	}

	@Test
	public void radixSortTest() {
		RadixSort sort = new RadixSort();
		Assert.assertArrayEquals(expecteds, sort.radixSort(A, n));
	}
}

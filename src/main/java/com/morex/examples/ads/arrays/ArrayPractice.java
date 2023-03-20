package com.morex.examples.ads.arrays;

import java.util.Arrays;

public class ArrayPractice {
	public static void main(String[] args) {
		reverseArray(new Integer[]{5, 1, 8, 2, 4});
	}

	private static void reverseArray(Integer[] array) {
		if (array.length == 0) {
			System.out.println("array is empty!");
			return;
		}
		System.out.println("the array: " + Arrays.toString(array));
		int start = 0, end = array.length - 1;
		while (start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		System.out.println("reverseArray() result : " + Arrays.toString(array)); // output: [4, 2, 8, 1, 5]
	}
}

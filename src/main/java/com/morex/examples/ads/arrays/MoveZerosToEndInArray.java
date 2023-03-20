package com.morex.examples.ads.arrays;

import java.util.Arrays;

public class MoveZerosToEndInArray {
	public static void main(String[] args) {
		moveZerosToEnd1(new Integer[]{5, 0, 6, 1, 0, 5, 8, 2, 0});
		moveZerosToEnd2(new Integer[]{5, 0, 6, 1, 0, 5, 8, 2, 0});
	}

	private static void moveZerosToEnd1(Integer[] arr) {
		if (arr.length == 0) {
			System.out.println("array is empty!");
			return;
		}
		System.out.println("the array: " + Arrays.toString(arr));
		// console output : the array: [5, 0, 6, 1, 0, 5, 8, 2, 0]
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if (arr[j] != 0) {
				j++;
			}
		}
		System.out.println("moveZerosToEnd1() result : " + Arrays.toString(arr));
		// console output : findMaxValue() result : [5, 6, 1, 5, 8, 2, 0, 0, 0]
	}

	private static void moveZerosToEnd2(Integer[] arr) {
		if (arr.length == 0) {
			System.out.println("array is empty!");
			return;
		}
		System.out.println("the array: " + Arrays.toString(arr));
		// console output : the array: [5, 0, 6, 1, 0, 5, 8, 2, 0]
		Integer[] arr2 = new Integer[arr.length];
		int start = 0, end = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr2[start++] = arr[i];
			} else {
				arr2[end--] = arr[i];
			}
		}
		System.out.println("moveZerosToEnd2() result : " + Arrays.toString(arr2));
		// console output : findMaxValue() result :
	}
}

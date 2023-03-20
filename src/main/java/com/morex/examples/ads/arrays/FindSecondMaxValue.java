package com.morex.examples.ads.arrays;

import java.util.Arrays;

public class FindSecondMaxValue {
	public static void main(String[] args) {
		findSecondMax(new Integer[]{5, 0, 6, 1, 6, 5, 8, 2});
	}

	private static void findSecondMax(Integer[] array) {
		if (array.length == 0) {
			System.out.println("array is empty!");
			return;
		}
		System.out.println("the array: " + Arrays.toString(array));
		// console output : the array: [5, 0, 6, 1, 6, 5, 8, 2]
		int max = array[0];
		int secondMax = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				secondMax = max;
				max = array[i];
			} else if (array[i] > secondMax && array[i] != max) {
				secondMax = array[i];
			}
		}
		System.out.println(String.format("findSecondMax() result : max=%s , secondMax=%s", max, secondMax));
		// console output : findSecondMax() result : max=8 , secondMax=6
	}
}

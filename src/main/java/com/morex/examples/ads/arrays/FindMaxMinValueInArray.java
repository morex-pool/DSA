package com.morex.examples.ads.arrays;

import java.util.Arrays;

public class FindMaxMinValueInArray {
	public static void main(String[] args) {
		findMaxValue(new Integer[]{5, 1, 8, 2, 4});
	}

	private static void findMaxValue(Integer[] array) {
		if (array.length == 0) {
			System.out.println("array is empty!");
			return;
		}
		System.out.println("the array: " + Arrays.toString(array));
		// console output : the array: [5, 1, 8, 2, 4]
		int max = array[0];
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
			if (array[i] < min)
				min = array[i];
		}
		System.out.println(String.format("findMaxValue() result : min=%s , max=%s", min, max));
		// console output : findMaxValue() result : min=1 , max=8
	}
}

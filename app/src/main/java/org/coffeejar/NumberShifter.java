package org.coffejar;

import java.util.Arrays;

/**
 * Shifts the array of numbers left or right
 */
public class NumberShifter {

	public int[] shiftLeft(int[] input, int count) {
		if (count < 0) {
			throw new IllegalArgumentException("Count should not be negative");
		}
		int length = input.length;
		int n = count % length;

		int[] result = new int[length];
		for (int i = 0; i < length; i++) {
			result[i] = input[(i + n) % length];
		}
		return result;
	}

	public int[] rightLeft(int[] input, int count) {
		if (count < 0) {
			throw new IllegalArgumentException("Count should not be negative");
		}
		int length = input.length;
		int n = count % length;

		int[] result = new int[length];
		for (int i = 0; i < length; i++) {
			result[(i + n) % length] = input[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 8, 9, 10 };

		var leftShiftedArr = new NumberShifter().shiftLeft(arr, 1);
		var rightShiftedArr = new NumberShifter().rightLeft(arr, 1);

		System.out.println(Arrays.toString(leftShiftedArr));
		System.out.println(Arrays.toString(rightShiftedArr));
	}
}

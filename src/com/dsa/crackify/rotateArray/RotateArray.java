package com.dsa.crackify.rotateArray;

import java.util.Arrays;

public class RotateArray {

	public static int []  rotate (int [] nums, int k) {

		int n = nums.length;
		k = k%n;

		reverse(nums, 0, n-1); // to reverse whole array
		reverse(nums, 0, k-1); //to reverse first k elements
		reverse(nums, k, n-1); // to reverse rest of elements

		return nums;

	}

	public static void reverse(int [] nums, int start, int end) {

		while(start< end) {

			int temp = nums[end];
			nums[end] = nums[start];
			nums[start] = temp;

			start ++;
			end--;
		}
	}

	public static void main(String[] args) {

		int k = 3;
		int[] nums = {1,2,3,4,5,6,7};

		RotateArray.rotate(nums, k);

		System.out.println(Arrays.toString(nums));
	}

}

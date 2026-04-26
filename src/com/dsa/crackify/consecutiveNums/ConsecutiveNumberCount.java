package com.dsa.crackify.consecutiveNums;

import java.util.HashSet;
import java.util.Set;

//This class has logic of longest consecutive numbers in the given array. 
public class ConsecutiveNumberCount {


	public static int consecutiveCount(int[] nums) {

		if(nums.length == 0 || nums == null) {

			return 0;
		}
		Set<Integer> set = new HashSet<>();

		int longest = 0;

		for(int num:nums) {
			set.add(num);
		}

		for(int num:set) {

			if(!set.contains(num-1)) {

				int length = 1;
				int currentNum = num;

				while(set.contains(currentNum+1)) {
					length ++;
					currentNum = currentNum+1;
				}

				longest = Math.max(length, longest);
			}

		}
		return longest;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {2,3,4,4,7,6,9,8,10};

		int consecutiveCount = ConsecutiveNumberCount.consecutiveCount(nums);
		
		System.out.println(consecutiveCount);

	}

}

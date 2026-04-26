package com.dsa.crackify.twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumIndexUsingHashMap { //T.C = O(n), this is the best approach.

	public static int [] twoSum(int [] nums, int target) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i<nums.length; i++) {
			
			int complement = target - nums[i];
			
			if(map.containsKey(complement)) {
				
				return new int [] {i, map.get(complement)};
				
			}
			
			map.put(nums[i], i); // store current number with index
		}
		return new int [] {};
	}
 	
	
	
	public static void main(String[] args) {
		
		int [] nums = {2,4,5,7,1,4,2};
		int target =6;
		
		int[] twoSum = TwoSumIndexUsingHashMap.twoSum(nums, target);
		
		System.out.println(Arrays.toString(twoSum));
	}
}

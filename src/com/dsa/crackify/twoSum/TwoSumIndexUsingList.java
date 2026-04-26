package com.dsa.crackify.twoSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// This program will return index numbers of two digits sum as per target, if target is 9 then will find two digits whose sum is 9 and prints their index numbers.
public class TwoSumIndexUsingList { // Using list the T.C is O(n^2), so best approach is by using HashMap

	// Time complexity of this program is  

	public static int [] twoSum(int [] num, int target) {

	List<Integer> list = new ArrayList<>();

		for(int n:num) {

			list.add(n);
		}

		for(int i = 0; i<num.length; i++ ) { //O(n) --- time complexity

			int complement = target - num[i];

			if(list.contains(complement)) {  //O(n) ---- time complexity   /// Total time complexity is O(n^2)

				int indexOf = list.indexOf(complement);

				if(indexOf != i) { // TO avoid duplicate indexes
					return new int [] {i, indexOf};
				}
			}
		}
		return new int [] {};
	}
	
	
	public static void main(String[] args) {
		
		int num [] = {2,4,9,8,6,1,4};
		int target = 14;
		
		int[] twoSum = TwoSumIndexUsingList.twoSum(num, target);
		
		System.out.println(Arrays.toString(twoSum));
	}

}
